/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex2;

/**
 *
 * @author Admin
 */
public class Ex2 {

    public static void main(String[] args) {
        Computer pcWithBT = new Computer.ComputerBuilder("500 GB", "16 GB")
                .setBluetoothEnabled(true)
                .build();
        Computer pcNoBT = new Computer.ComputerBuilder("1 TB", "8 GB")
                .build();
        
        System.out.println("May 1: " +pcWithBT);
        System.out.println("May 2: " +pcNoBT);
    }
}
