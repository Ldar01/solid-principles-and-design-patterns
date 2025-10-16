package com.uca.SOLID.dependencyInversionPrinciple;

import com.uca.SOLID.dependencyInversionPrinciple.bad.NotificationService;
import com.uca.SOLID.dependencyInversionPrinciple.good.EmailSender;
import com.uca.SOLID.dependencyInversionPrinciple.good.MessageSender;
import com.uca.SOLID.dependencyInversionPrinciple.good.NotificationServiceGood;

public class DependencyInversion {
    public static void main(String[] args) {
        badScene();
        goodScene();
    }

    public static void badScene(){
        System.out.println("=== Bad Scene: ===");
        NotificationService notificationService = new NotificationService();
        notificationService.notifyUser("Hello, User!");
    }

    public static void goodScene(){
        System.out.println("=== Good Scene: ===");
        MessageSender sender = new EmailSender();
        // Puedes cambiar a SmsSender sin modificar NotificationServiceGood
        NotificationServiceGood notificationService = new NotificationServiceGood(sender);
        notificationService.notifyUser("Hello, User!", "email@test.com");
    }
}
