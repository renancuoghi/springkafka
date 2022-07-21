package org.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public abstract class TopicKafka {

    public abstract String getTopic();
}
