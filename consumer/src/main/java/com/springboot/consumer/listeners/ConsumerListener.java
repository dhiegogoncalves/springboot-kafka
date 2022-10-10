package com.springboot.consumer.listeners;

import org.springframework.stereotype.Component;

import com.springboot.consumer.custom.ConsumerCustomListener;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class ConsumerListener {

    @ConsumerCustomListener(groupId = "group-1")
    public void create(String message) {
        log.info("CREATE ::: Receive message {}", message);
    }

    @ConsumerCustomListener(groupId = "group-1")
    public void log(String message) {
        log.info("LOG ::: Receive message {}", message);
    }

    @ConsumerCustomListener(groupId = "group-2")
    public void history(String message) {
        log.info("HISTORY ::: Receive message {}", message);
    }
}
