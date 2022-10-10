package com.springboot.consumer.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class ConsumerListener {

    @KafkaListener(groupId = "group-1", topics = "topic", containerFactory = "containerFactory")
    public void listener(String message) {
        log.info("Receive message {}", message);
    }
}
