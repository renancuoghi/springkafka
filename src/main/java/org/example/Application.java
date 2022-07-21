package org.example;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;




@EnableScheduling
@SpringBootApplication
public class Application {

    public static void main(String[] args){
        LoggerFactory.getLogger(Application.class).info("Running..........");
        SpringApplication.run(Application.class, args);
    }
}
