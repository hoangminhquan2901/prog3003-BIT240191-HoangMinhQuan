package com.mycompany.exfour; // Thay đổi tên package cho đúng với project của bạn

interface PaymentStrategy {
    void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Thanh toan " + amount + " qua Credit Card thanh cong.");
    }
}

class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Thanh toan " + amount + " qua PayPal thanh cong.");
    }
}

class ShoppingCart {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void checkout(int amount) {
        if (strategy == null) {
            System.out.println("Vui long chon phuong thuc thanh toan");
        } else {
            strategy.pay(amount);
        }
    }
}

public class ExFour {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        System.out.println("Khach hang chon PayPal");
        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(1000);

        System.out.println("\n Khach hang doi sang Credit Card");
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(2500);
    }
}