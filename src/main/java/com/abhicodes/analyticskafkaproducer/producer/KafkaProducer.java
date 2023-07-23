package com.abhicodes.analyticskafkaproducer.producer;

import com.abhicodes.analyticskafkaproducer.vo.Event;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
@Slf4j
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, Event> greetingKafkaTemplate;

    @Value(value = "${message.topic.name}")
    private String topicName;

    public void sendMessage(Event message) {

        CompletableFuture<SendResult<String, Event>> future = greetingKafkaTemplate.send(topicName, message);

        future.whenComplete((result, ex) -> {
            if (ex == null) {
                log.info("Sent message=[" + message + "] with offset=[" + result.getRecordMetadata().offset() + "]"
                        + "to partition=[" + result.getRecordMetadata().partition() + "]");
            } else {
                log.error("Unable to send message=[" + message + "] due to : " + ex.getMessage());
            }

        });
    }
}