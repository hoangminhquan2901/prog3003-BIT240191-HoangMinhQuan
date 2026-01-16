/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex1;

/**
 *
 * @author Admin
 */
public class Ex1<T> {
    private T data;

    public void set (T t){
        this.data = t;
    }

    public T get(){
        return this.data;
    }

    public static void main(String[] args){
        Ex1<Integer> integerTest = new Ex1<>();
        integerTest.set(2026);
        System.out.println("Gia tri integer: " +integerTest.get());
        Ex1<String> stringTest = new Ex1<>();
        stringTest.set("yessir");
        System.out.println("Hello " +stringTest.get());
    }
}
