/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex3;

/**
 *
 * @author Admin
 */
interface Pair<K, V>{
    K getKey();
    V getValue();
}
class OrderedPair<K, V> implements Pair<K, V>{
    private K key;
    private V value;
    
    public OrderedPair(K key, V value){
        this.key = key;
        this.value = value;
    }
    
    @Override
    public K getKey() {return key;}
    @Override
    public V getValue() {return value;} 
}
   public class Ex3 {
    public static void main(String[] args) {
        Pair<String, String> p1 = new OrderedPair<>("MSSV", "BIT240191");
        Pair<String, String> p2 = new OrderedPair<>("Ho ten", "Hoang Minh Quan");
        
        System.out.println("Pair 1: " + p1.getKey() + " = " + p1.getValue());
        System.out.println("Pair 2: " + p2.getKey() + " = " + p2.getValue());
    }
}
