package com.springKafka.kafkaConfig;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component

public class KafkaConsumer {

    @KafkaListener(topics = "Project")
    public void listen(String message) {
        System.out.println("Received Message: " + message);
    }
}

