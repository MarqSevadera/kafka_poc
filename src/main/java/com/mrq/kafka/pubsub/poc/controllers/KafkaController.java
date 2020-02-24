package com.mrq.kafka.pubsub.poc.controllers;

import com.mrq.kafka.pubsub.poc.services.Producer;
import com.mrq.kafka.pubsub.poc.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private Producer producer;

    @PostMapping("/publish")
    public String publishMessage(@RequestBody UserModel request){
        producer.sendMessage(request);
        return "Message was successfully published!";
    }

}
