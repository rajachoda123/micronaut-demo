package com.learning.service;

import jakarta.inject.Singleton;

@Singleton
public class TextNotification implements NotificationService {

    @Override
    public String notifyUser() {
        return "Text Notification";
    }
}
