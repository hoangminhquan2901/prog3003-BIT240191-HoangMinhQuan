/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exthree;

/**
 *
 * @author Admin
 */
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
public class ExThree {

    public static void main(String[] args) {
        CompletableFuture<int[]>startFuture = CompletableFuture.supplyAsync(() -> {
            int[] inputArray = {1, 2, 5, 3, 100};
            System.out.println("Da cung cap array "+Arrays.toString(inputArray));
            return inputArray;
        });
        
        CompletableFuture<List<Integer>>processedFuture = startFuture.thenApplyAsync(array ->{
            List<Integer>result = Arrays.stream(array)
                    .filter(n -> n % 2 != 0)
                    .sorted()
                    .boxed()
                    .collect(Collectors.toList());
            System.out.println("Da loc va sap xep: "+result);
            return result;
        });
        
        CompletableFuture<String>formattedFuture = processedFuture.thenApplyAsync(list ->{
            return "Ket qua la: "+list.toString();
        });
        
        formattedFuture.thenAccept(finalResult -> {
            System.out.println(""+finalResult);
        });
        
        formattedFuture.join();
    }
}
