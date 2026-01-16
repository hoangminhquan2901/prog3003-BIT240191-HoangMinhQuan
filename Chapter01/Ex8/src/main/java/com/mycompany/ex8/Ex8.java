/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex8;
import java.util.HashMap;
/**
 *
 * @author Admin
 */
public class Ex8 {

    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(101, "Anna");
        employees.put(102, "Peter");
        employees.put(103, "Mary");
        
        System.out.println("Nhan vien 102: " +employees.get(102));
        
        if(!employees.containsKey(105)){
            employees.put(105, "Unknown");
        }
        
        System.out.println("Danh sach: " +employees);
    }
}
