package com.example.springboot_kafkaconsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "test-topic", groupId = "group1")
    public void listenGroup1(String message) {
        System.out.println("Received Message in group 'group1': " + message);
    }

    @KafkaListener(topics = "test-topic", groupId = "group2")
    public void listenGroup2(String message) {
        System.out.println("Received Message in group 'group2': " + message);
    }
}
