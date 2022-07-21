package org.example.services.message;



import org.example.services.TopicKafkaListener;
import org.example.services.logged.TopicLoggedService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;

import org.springframework.kafka.support.Acknowledgment;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;


@Component
public class TopicMessageListener extends TopicKafkaListener {
    // same name in application.properties
    @Value("${topic.name.message}")
    private String topic;

    @Autowired
    private TopicLoggedService topicLoggedService;


    @Override
    @KafkaListener(topics = "${topic.name.message}", groupId = "group_id")
    public void consume(@Payload String valor, Acknowledgment ack){
        super.consume(valor,ack);
        this.topicLoggedService.send(valor);
    }


    @Override
    public String getTopic() {
        return topic;
    }
}
