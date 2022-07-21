package org.example.services.logged;


import org.example.services.TopicKafkaListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;


@Component
public class TopicLoggedListener extends TopicKafkaListener {
    // same name in application.properties
    @Value("${topic.name.logger}")
    private String topic;


    @Override
    @KafkaListener(topics = "${topic.name.logger}", groupId = "group_id")
    public void consume(@Payload String valor, Acknowledgment ack){
        super.consume(valor,ack);
    }


    @Override
    public String getTopic() {
        return topic;
    }
}
