package org.example.services.message;

import org.example.services.TopicKafkaService;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;


@Service
public class TopicMessageService extends TopicKafkaService {
    // same name in application.properties
    @Value("${topic.name.message}")
    private String topic;


    @Override
    public String getTopic() {
        return this.topic;
    }
}
