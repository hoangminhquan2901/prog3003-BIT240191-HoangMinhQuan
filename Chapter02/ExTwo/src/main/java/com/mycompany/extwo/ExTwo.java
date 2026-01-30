package com.mycompany.extwo;

interface Notification {
    void notifyUser();
}

class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Dang gui thong bao qua SMS...");
    }
}

class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Dang gui thong bao qua Email...");
    }
}

class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Dang gui thong bao Push...");
    }
}

class NotificationFactory {
    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty()) {
            return null;
        }
        switch (channel.toUpperCase()) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                return null;
        }
    }
}

public class ExTwo {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification n1 = factory.createNotification("EMAIL");
        if (n1 != null) {
            n1.notifyUser();
        }

        Notification n2 = factory.createNotification("SMS");
        if (n2 != null) {
            n2.notifyUser();
        }
    }
}