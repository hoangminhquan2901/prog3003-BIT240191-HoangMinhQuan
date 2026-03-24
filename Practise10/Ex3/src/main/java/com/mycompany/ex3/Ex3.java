/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex3;

/**
 *
 * @author Admin
 */
class WorkerThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread dang chay");
    }
}

class WorkerRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Runnable dang chay");
    }
}
public class Ex3 {
    public static void main(String[] args) {
        WorkerThread thread = new WorkerThread();
        thread.start();
        Thread runnableThread = new Thread(new WorkerRunnable());
        runnableThread.start();
    }
}
