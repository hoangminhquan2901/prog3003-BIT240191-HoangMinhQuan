/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.extwo;

/**
 *
 * @author Admin
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ExTwo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java_exercise";
        String user = "root";
        String password = "minhquan120605"; // Nhập mật khẩu của bạn

        int idToDelete = 3;

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String sql = "DELETE FROM users WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, idToDelete);

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Xoa thanh cong user co ID: " + idToDelete);
            } else {
                System.out.println("Khong tim thay user de xoa");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
