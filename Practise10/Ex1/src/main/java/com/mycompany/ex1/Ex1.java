/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex1;

/**
 *
 * @author Admin
 */
import java.util.HashMap;
public class Ex1 {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(101, "Anna");
        employees.put(102, "Peter");
        employees.put(103, "Mary");
        
        String name102 = employees.get(102);
        System.out.println("Nhan vien ID 102: "+name102);
        
        if(!employees.containsKey(105)){
            employees.put(105, "Uknown");
            System.out.println("Da them nhan vien ID 105");
        }
        
        System.out.println("Danh sach nhan vien: "+employees);
    }
}
