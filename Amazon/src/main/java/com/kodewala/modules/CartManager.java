package com.kodewala.modules;



import com.kodewala.config.DatabaseConfig;
import java.sql.*;

public class CartManager {
    public void addToCart(int userId, int prodId, int qty) {
        String sql = "INSERT INTO cart (user_id, product_id, quantity) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, userId);
            pstmt.setInt(2, prodId);
            pstmt.setInt(3, qty);
            pstmt.executeUpdate();
            System.out.println("Item added to cart!");
        } catch (SQLException e) {
            System.out.println("Cart Error: " + e.getMessage());
        }
    }

    public void showCart(int userId) {
        String sql = "SELECT c.cart_id, p.product_name, c.quantity FROM cart c " +
                     "JOIN products p ON c.product_id = p.id WHERE c.user_id = ?";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, userId);
            ResultSet rs = pstmt.executeQuery();
            System.out.println("\n--- Your Cart ---");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt(1) + " | Product: " + rs.getString(2) + " | Qty: " + rs.getInt(3));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}