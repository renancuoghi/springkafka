package org.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public abstract class TopicKafkaService extends TopicKafka{

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public void send(String message){
        this.kafkaTemplate.send(this.getTopic(), message);
    }

}
