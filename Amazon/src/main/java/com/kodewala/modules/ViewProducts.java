package com.kodewala.modules;

import com.kodewala.config.DatabaseConfig;
import java.sql.*;

public class ViewProducts {
    public void display() {
        String sql = "SELECT * FROM products";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) { // [cite: 11, 37]

            ResultSet rs = pstmt.executeQuery();
            System.out.println("\n--- Product Catalog ---");
            System.out.println("ID | Name | Price | Stock");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " + rs.getString("product_name") +
                                   " | " + rs.getInt("price") + " | " + rs.getInt("quantity"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}