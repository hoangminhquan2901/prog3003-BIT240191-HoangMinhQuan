/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exone;

/**
 *
 * @author Admin
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExOne {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java_exercise";
        String user = "root";
        String password = "minhquan120605";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            
            Statement statement = connection.createStatement();
            
            String sql = "SELECT * FROM users";
            ResultSet resultSet = statement.executeQuery(sql);

            System.out.println("Danh sach nguoi dung:");
            System.out.println("------------------------------------");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String email = resultSet.getString("email");

                System.out.println(id + " - " + username + " - " + email);
            }

            resultSet.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
