/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.extwo;

/**
 *
 * @author Admin
 */
class NumberPrinter extends Thread{
    public NumberPrinter(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println(getName()+" in so: "+i);
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
public class ExTwo {

    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            NumberPrinter t = new NumberPrinter("Thread "+i);
            t.start();
        }
    }
}
