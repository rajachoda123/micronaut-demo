package com.learning.service;

import jakarta.inject.Singleton;

@Singleton
public class EmailNotfiy implements NotificationService {

    @Override
    public String notifyUser() {
        return "Email Notification";
    }
}
