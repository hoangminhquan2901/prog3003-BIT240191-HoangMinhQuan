/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex9;
import java.util.TreeMap;
import java.util.SortedMap;
/**
 *
 * @author Admin
 */
public class Ex9 {

    public static void main(String[] args) {
        TreeMap<String, Double> products = new TreeMap<>();
        products.put("Laptop", 1500.0);
        products.put("Mouse", 25.0);
        products.put("Keyboard", 50.0);
        
        System.out.println("Danh sach:" +products);
        
        SortedMap<String, Double> filtered = products.subMap("K", "N");
        
        System.out.println("San pham K den M: " +filtered);
    }
}
