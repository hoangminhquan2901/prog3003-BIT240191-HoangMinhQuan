/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exfour;

/**
 *
 * @author Admin
 */
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
public class ExFour {

    public static void main(String[] args) {
        System.out.println("Bat dau xu ly don hang");
        CompletableFuture<Void>checkStock = CompletableFuture.runAsync(() -> {
            simulateTask("Kiem tra san pham", 1500);
        });
        
        CompletableFuture<Void>payment = CompletableFuture.runAsync(() -> {
            simulateTask("Thanh toan", 2000);
        });
        
        CompletableFuture<Void>shipping = CompletableFuture.runAsync(() -> {
            simulateTask("Van chuyen", 1000);
        });
        
        CompletableFuture<Void>allTasks = CompletableFuture.allOf(checkStock, payment, shipping);
        
        allTasks.thenRun(() -> {
            System.out.println("He thong hoan thanh xu ly don hang thanh cong");
        }).join();
    }
    private static void simulateTask(String taskName, int duration){
        try{
            System.out.println("Dang thuc hien: "+taskName+"...");
            Thread.sleep(duration);
            System.out.println("Hoan thanh: "+taskName);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
