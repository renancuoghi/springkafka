package org.example.controller;

import org.example.services.message.TopicMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/test")
public class TopicTestController {

    @Autowired
    private TopicMessageService topicTestService;

    @GetMapping
    @ResponseBody
    public String send(@RequestParam String message){
        this.topicTestService.send(message);
        return message;
    }
}
