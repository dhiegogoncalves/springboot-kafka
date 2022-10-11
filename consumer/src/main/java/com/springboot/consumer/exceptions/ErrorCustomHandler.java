package com.springboot.consumer.exceptions;

import org.springframework.kafka.listener.KafkaListenerErrorHandler;
import org.springframework.kafka.listener.ListenerExecutionFailedException;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class ErrorCustomHandler implements KafkaListenerErrorHandler {

    @Override
    public Object handleError(Message<?> message, ListenerExecutionFailedException exception) {
        log.error("EXCEPTION_HANDLER ::: {}" + exception.getMessage());
        log.error("Payload ::: {}" + message.getPayload());
        log.error("Headers ::: {}" + message.getHeaders());
        log.error("Offset ::: {}" + message.getHeaders().get("kafka_offset"));
        log.error("Payload ::: {}" + message.getPayload());

        return null;
    }

}
