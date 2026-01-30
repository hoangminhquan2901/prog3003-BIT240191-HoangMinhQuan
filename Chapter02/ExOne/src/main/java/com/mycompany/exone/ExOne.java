/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exone;

/**
 *
 * @author Admin
 */
public class ExOne {
    private static ExOne instance;
    private ExOne() {
        System.out.println("Dang thiet lap ket noi Database");
    }
    public static ExOne getInstance() {
        // Nếu chưa có instance thì tạo mới
        if (instance == null) {
            instance = new ExOne();
        }
        return instance;
    }
    public void query(String sql) {
        System.out.println("Đang thực thi lệnh: " + sql);
    }
}
