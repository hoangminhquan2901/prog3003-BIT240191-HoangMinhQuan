/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex1;

/**
 *
 * @author Admin
 */
public class Ex1 {

 public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.print(element + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Java", "Generic", "Method", "Example"};

        System.out.println("Mang so nguyen (Integer):");
        printArray(intArray);

        System.out.println("Mang chuoi (String):");
        printArray(stringArray);
    }
}
