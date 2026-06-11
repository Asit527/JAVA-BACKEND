package com.rapido.booking;

import java.sql.*;

public class JDBCPrepStmt {

    // Helper method to get a connection (using your existing logic)
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(DBDetails.url, DBDetails.user, DBDetails.password);
    }

    // CREATE: Insert a new booking
    public void create(Connection conn, int userId, String pickup, String drop) throws SQLException {
        String insert = "INSERT INTO bookings (user_id, pickup_location, drop_location, status) VALUES (?, ?, ?, 'searching')";

        try (PreparedStatement pstmt = conn.prepareStatement(insert)) {
            pstmt.setInt(1, userId);
            pstmt.setString(2, pickup);
            pstmt.setString(3, drop);

            int rowsAffected = pstmt.executeUpdate();
            System.out.println("Booking created successfully. Rows affected: " + rowsAffected);
        }
    }

    // READ: Fetch ride history for a user
    public void read(Connection conn, int userId) throws SQLException {
        String read = "SELECT booking_id, pickup_location, drop_location, status, booking_time " +
                      "FROM bookings WHERE user_id = ? ORDER BY booking_time DESC";

        try (PreparedStatement pstmt = conn.prepareStatement(read)) {
            pstmt.setInt(1, userId);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("booking_id") +
                                   " | From: " + rs.getString("pickup_location") +
                                   " | To: " + rs.getString("drop_location") +
                                   " | Status: " + rs.getString("status"));
            }
        }
    }

    // UPDATE: Change the status of a booking
    public void update(Connection conn, String newStatus, int bookingId) throws SQLException {
        String update = "UPDATE bookings SET status = ? WHERE booking_id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(update)) {
            pstmt.setString(1, newStatus);
            pstmt.setInt(2, bookingId);

            pstmt.executeUpdate();
            System.out.println("Booking status updated to: " + newStatus);
        }
    }

    // DELETE: Remove a booking
    public void delete(Connection conn, int bookingId) throws SQLException {
        String delete = "DELETE FROM bookings WHERE booking_id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(delete)) {
            pstmt.setInt(1, bookingId);

            pstmt.executeUpdate();
            System.out.println("Booking ID " + bookingId + " deleted.");
        }
    }
}