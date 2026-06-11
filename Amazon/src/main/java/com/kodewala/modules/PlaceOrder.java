package com.kodewala.modules;

import com.kodewala.config.DatabaseConfig;
import java.sql.*;

public class PlaceOrder {
    public void execute(int userId, int productId, int qty) {
        Connection conn = null;
        try {
            conn = DatabaseConfig.getConnection();
            conn.setAutoCommit(false);

            // 1. Validate Stock
            String checkSql = "SELECT price, quantity FROM products WHERE id = ?";
            PreparedStatement checkStmt = conn.prepareStatement(checkSql);
            checkStmt.setInt(1, productId);
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next() && rs.getInt("quantity") >= qty) {
                int price = rs.getInt("price");

                // 2. Create Order Record
                String orderSql = "INSERT INTO orders (user_id) VALUES (?)";
                PreparedStatement orderStmt = conn.prepareStatement(orderSql, Statement.RETURN_GENERATED_KEYS);
                orderStmt.setInt(1, userId);
                orderStmt.executeUpdate();
                ResultSet keys = orderStmt.getGeneratedKeys();
                keys.next();
                int orderId = keys.getInt(1);

                // 3. Update Inventory
                String updateSql = "UPDATE products SET quantity = quantity - ? WHERE id = ?";
                PreparedStatement updateStmt = conn.prepareStatement(updateSql);
                updateStmt.setInt(1, qty);
                updateStmt.setInt(2, productId);
                updateStmt.executeUpdate();

                // 4. Store Order Items
                String itemSql = "INSERT INTO order_items (order_id, product_id, quantity, price) VALUES (?, ?, ?, ?)";
                PreparedStatement itemStmt = conn.prepareStatement(itemSql);
                itemStmt.setInt(1, orderId);
                itemStmt.setInt(2, productId);
                itemStmt.setInt(3, qty);
                itemStmt.setInt(4, price);
                itemStmt.executeUpdate();

                conn.commit();
                System.out.println("Order Placed Successfully! Order ID: " + orderId);
            } else {
                System.out.println("Order Failed: Insufficient Stock.");
            }
        } catch (SQLException e) {
            try { if (conn != null) conn.rollback(); } catch (SQLException ex) { ex.printStackTrace(); }
            System.out.println("Transaction Failed: " + e.getMessage());
        } finally {
            try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }
}