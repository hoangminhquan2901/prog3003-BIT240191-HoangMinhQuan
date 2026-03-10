/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex3;

/**
 *
 * @author Admin
 */
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
public class Ex3 {

    public static void main(String[] args) throws ExecutionException, InterruptedException{
        CompletableFuture<String> verifyCustomer = CompletableFuture.supplyAsync(()->{
            simulateTask("Xac thuc thong tin khach hang...", 200);
            System.out.println("[Hoan thanh] thong tin hop le");
            return "Khach hang: Hoang Minh Quan";
        });
        
        CompletableFuture<String> issueTicket = CompletableFuture.supplyAsync(()->{
            simulateTask("Dang xuat ve...", 3000);
            System.out.println("[Hoan thanh] Ve duoc tao thanh cong");
            return "Ve: Tho oi";
        });
        
        CompletableFuture<String> result = verifyCustomer.thenCombine(issueTicket, (customer, ticket) ->{
            return "He thong dat ve thanh cong: ["+customer+"] da dat ["+ticket+"]";
        });
        
        System.out.println("Ket qua cuoi: "+result.get());
    }
    
    private static void simulateTask(String message, int milliseconds){
        try{
            System.out.println(message);
            Thread.sleep(milliseconds);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
