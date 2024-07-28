package com.example.flightstatus.service;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void sendNotification(String topic, String title, String body) {
        Message message = Message.builder()
            .setTopic(topic)
            .putData("title", title)
            .putData("body", body)
            .build();

        FirebaseMessaging.getInstance().sendAsync(message);
    }
}
