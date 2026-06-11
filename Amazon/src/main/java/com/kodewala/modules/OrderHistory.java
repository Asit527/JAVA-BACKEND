package com.kodewala.modules;

import com.kodewala.config.DatabaseConfig;
import java.sql.*;

public class OrderHistory {
    public void display(int userId) {
        String sql = "SELECT o.order_id, o.order_date, p.product_name, oi.quantity FROM orders o " +
                     "JOIN order_items oi ON o.order_id = oi.order_id " +
                     "JOIN products p ON oi.product_id = p.id WHERE o.user_id = ?";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, userId);
            ResultSet rs = pstmt.executeQuery();
            System.out.println("\n--- Order History ---");
            while (rs.next()) {
                System.out.println("Order #" + rs.getInt(1) + " | " + rs.getTimestamp(2) +
                                   " | " + rs.getString(3) + " | Qty: " + rs.getInt(4));
            }
        } catch (SQLException e) {
            System.out.println("History Error: " + e.getMessage());
        }
    }
}