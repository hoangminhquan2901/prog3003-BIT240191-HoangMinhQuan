/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex4;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class Ex4 {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        
        System.out.println("Danh sach luc dau: " +fruits);
        
        fruits.add(1, "Mango");
        
        System.out.println("Sau khi them xoai vao chi so 1: " +fruits);
        
        int indexBanana = fruits.indexOf("Banana");
        if (indexBanana != -1){
            fruits.set(indexBanana, "Grapes");
        }
        
        System.out.println("Sau khi thay chuoi bang nho: " +fruits);
        
        boolean isPresent = fruits.contains("Apple");
        System.out.println("Co tao trong list ko: " +isPresent);
    }
}
