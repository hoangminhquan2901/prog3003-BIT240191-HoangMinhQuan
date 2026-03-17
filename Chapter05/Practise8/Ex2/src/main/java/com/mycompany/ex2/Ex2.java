/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex2;

/**
 *
 * @author Admin
 */
interface Payment {
    void processPayment(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Thanh toan "+amount+" qua the Credit Card thanh cong");
    }
}

class PayPalPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Thanh toan "+amount+" qua tai khoan PayPal thanh cong");
    }
}

class CashPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Thanh toan "+amount+" bang tien mat tai quay");
    }
}

class PaymentFactory {
    public static Payment getPaymentMethod(String type) {
        if (type == null) return null;
        
        return switch (type.toUpperCase()) {
            case "CREDIT_CARD" -> new CreditCardPayment();
            case "PAYPAL" -> new PayPalPayment();
            case "CASH" -> new CashPayment();
            default -> throw new IllegalArgumentException("Phuong thuc khong hop le");
        };
    }
}

public class Ex2 {

    public static void main(String[] args) {
        Payment p1 = PaymentFactory.getPaymentMethod("PAYPAL");
        p1.processPayment(150.50);
        Payment p2 = PaymentFactory.getPaymentMethod("CREDIT_CARD");
        p2.processPayment(2000.0);
        Payment p3 = PaymentFactory.getPaymentMethod("CASH");
        p3.processPayment(50.0);
    }
}
