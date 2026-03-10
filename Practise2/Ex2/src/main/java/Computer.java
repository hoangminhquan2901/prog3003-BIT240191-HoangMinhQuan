/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2;
/**
 *
 * @author Admin
 */
public class Computer {
    private String HDD;
    private String RAM;
    private boolean isBluetoothEnabled;
    
    private Computer(ComputerBuilder builder){
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }
    
    public String HDD() {return HDD;}
    public String RAM() {return RAM;}
    public boolean isBluetoothEnabled() {return isBluetoothEnabled;}
    
    @Override
    public String toString(){
        return "Computer [HDD =" +HDD+ ", RAM =" +RAM+ ",Bluetooth =" +isBluetoothEnabled+ "}";
    }
    
    public static class ComputerBuilder{
        private String HDD;
        private String RAM;
        private boolean isBluetoothEnabled;
        
        public ComputerBuilder(String hdd, String ram){
            this.HDD = hdd;
            this.RAM = ram;
        }
        
        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled){
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }
        
        public Computer build(){
            return new Computer(this);
        }
    }
}
