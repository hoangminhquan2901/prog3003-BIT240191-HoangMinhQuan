/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex1;

/**
 *
 * @author Admin
 */
import java.util.TreeSet;
public class Ex1 {

    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("John");
        names.add("Alice");
        names.add("Zack");
        names.add("Bob");
        
        System.out.println("Danh sach da sap xep: ");
        
        String first = names.first();
        String last = names.last();
        
        System.out.println("Phan tu dau tien: "+first);
        System.out.println("Phan tu cuoi: "+last);
    }
}