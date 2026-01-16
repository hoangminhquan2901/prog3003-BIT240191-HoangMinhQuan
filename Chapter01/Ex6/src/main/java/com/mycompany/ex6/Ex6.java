/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex6;
import java.util.HashSet;
import java.util.Arrays;
/**
 *
 * @author Admin
 */
public class Ex6 {

    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 9, 2, 5, 8, 1};
        HashSet<Integer> uniqueNumbers = new HashSet<>(Arrays.asList(numbers));
        
        System.out.println("Cac phan tu duy nhat: " +uniqueNumbers);
    }
}
