package com.mrq.kafka.pubsub.poc.services;

import com.mrq.kafka.pubsub.poc.models.UserModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    private static final Logger logger = LoggerFactory.getLogger(Producer.class);
    private static final String TOPIC  = "users";

    @Autowired
    private KafkaTemplate<String, UserModel> kafkaTemplate;

    public void sendMessage(UserModel userModel){
        kafkaTemplate.send(TOPIC, userModel);
    }
}
