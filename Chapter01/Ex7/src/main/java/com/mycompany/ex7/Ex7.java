/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex7;
import java.util.TreeSet;
/**
 *
 * @author Admin
 */
public class Ex7 {

    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("John");
        names.add("Alice");
        names.add("Zach");
        names.add("Bob");
        
        System.out.println("Danh sach: " +names);
        
        String first = names.first();
        String last = names.last();
        
        System.out.println("Phan tu dau tien: " +first);
        System.out.println("Phan tu cuoi: " +last);
    }
}
