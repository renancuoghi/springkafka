package org.example.services.logged;

import org.example.services.TopicKafkaService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class TopicLoggedService extends TopicKafkaService {
    // same name in application.properties
    @Value("${topic.name.logger}")
    private String topic;


    @Override
    public String getTopic() {
        return this.topic;
    }
}
