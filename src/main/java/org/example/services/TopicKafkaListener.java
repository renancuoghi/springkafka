package org.example.services;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.messaging.handler.annotation.Payload;

public abstract class TopicKafkaListener extends TopicKafka {


    public void consume(@Payload String valor, Acknowledgment ack){
        Logger log = LoggerFactory.getLogger(TopicKafkaListener.class);
        System.out.println("--------- CONSUMING -----------------");
        System.out.println(this.getTopic());
        System.out.println(valor);
        log.info("------------ CONSUMING -----------------");
        log.info("Topic: {}",this.getTopic());
        log.info("Message: {}",valor);
        // commit message processing
        ack.acknowledge();

    }


}
