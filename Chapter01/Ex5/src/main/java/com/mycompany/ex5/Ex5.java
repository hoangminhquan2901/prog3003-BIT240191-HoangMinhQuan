/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex5;
import java.util.LinkedList;
/**
 *
 * @author Admin
 */
public class Ex5 {

    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.addFirst(5);
        queue.addLast(40);
        
        System.out.println("Danh sach sau khi them: " +queue);
        
        queue.removeFirst();
        queue.removeLast();
        
        System.out.println("Danh sach cuoi cung:" +queue);
    }
}
