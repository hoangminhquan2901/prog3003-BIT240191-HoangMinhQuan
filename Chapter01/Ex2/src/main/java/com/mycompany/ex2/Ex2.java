/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex2;

/**
 *
 * @author Admin
 */
public class Ex2 {
    public static <E> void printArray(E[] inputArray){
        for(E element: inputArray){
            System.out.println(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"mot", "hai", "ba", "bon", "nam"};
        
        System.out.println("Integer: ");
        printArray(intArray);
        
        System.out.println("String");
        printArray(stringArray);
    }
}