/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex2;

/**
 *
 * @author Admin
 */
interface MessageService {
    void sendMessage(String message);
}

class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("[Email] Gui noi dung: " + message);
    }
}

class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("[SMS] Gui noi dung: " + message);
    }
}

class Notification {
    private MessageService messageService;

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void send(String msg) {
        if (this.messageService != null) {
            this.messageService.sendMessage(msg);
        } else {
            System.out.println("Loi: Dich vu gui tin chua đuoc thiet lap");
        }
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Notification notification = new Notification();

        notification.setMessageService(new EmailService());
        notification.send("Chao mung ban den voi khoa hoc Java");

        System.out.println("Doi dich vu");

        notification.setMessageService(new SMSService());
        notification.send("Ma OTP cua ban la: 123456");
    }
}
