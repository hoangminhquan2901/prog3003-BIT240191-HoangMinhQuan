/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex3;

/**
 *
 * @author Admin
 */
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
public class Ex3 {

    public static CompletableFuture<String> authenticate(String customerId) {
        return CompletableFuture.supplyAsync(() -> {
            simulateDelay(1000); 
            if (customerId.equals("UNKNOWN")) {
                throw new RuntimeException("Xac thuc that bai: Khach hang khong ton tai");
            }
            System.out.println("[1] Xac thuc thanh cong cho: " + customerId);
            return customerId;
        });
    }

    public static CompletableFuture<Double> checkBalance(String customerId, double amount) {
        return CompletableFuture.supplyAsync(() -> {
            simulateDelay(1500); 
            double balance = 5000.0; 
            if (amount > balance) {
                throw new RuntimeException("Kiem tra so du that bai: So du khong du");
            }
            System.out.println("[2] Kiem tra so du hoan tat. Du dieu kien chuyen: " + amount);
            return amount;
        });
    }

    public static CompletableFuture<String> transferMoney(double amount) {
        return CompletableFuture.supplyAsync(() -> {
            simulateDelay(500); 
            return "Giao dich thanh cong. Da chuyen: $" + amount;
        });
    }

    private static void simulateDelay(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        String customerId = "USER_123"; 
        double transferAmount = 1200.0;

        System.out.println("--- Bat dau giao dich cho " + customerId + " ---");

        authenticate(customerId)
            .thenCompose(id -> checkBalance(id, transferAmount))
            .thenCompose(amount -> transferMoney(amount))
            .thenAccept(result -> System.out.println("KET QUA: " + result))
            .exceptionally(ex -> {
                System.err.println("GIAO DICH BI HUY: " + ex.getMessage());
                return null;
            });

        simulateDelay(4000);
        System.out.println("--- He thong hoan tat xu ly ---");
    }
}

