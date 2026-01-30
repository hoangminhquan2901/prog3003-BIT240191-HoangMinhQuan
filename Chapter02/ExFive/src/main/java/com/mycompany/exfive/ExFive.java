package com.mycompany.exfive; // Bạn nhớ đổi tên package cho khớp với project của bạn nhé

interface MessageService {
    void sendMessage(String message);
}

class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Gui Email voi noi dung: " + message);
    }
}

class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Gui SMS voi noi dung: " + message);
    }
}

class Notification {
    private MessageService service;

    public void setService(MessageService service) {
        this.service = service;
    }

    public void send(String message) {
        if (service != null) {
            service.sendMessage(message);
        } else {
            System.out.println("Loi: Chua thiet lap dich vu gui tin nhan!");
        }
    }
}

public class ExFive {
    public static void main(String[] args) {
        Notification notification = new Notification();

        System.out.println("--- Demo dich vu Email ---");
        notification.setService(new EmailService());
        notification.send("Chao mung ban den voi he thong!");

        System.out.println("\n--- Demo dich vu SMS ---");
        notification.setService(new SMSService());
        notification.send("Ma OTP cua ban la 123456.");
    }
}