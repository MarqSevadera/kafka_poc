package com.mrq.kafka.pubsub.poc.services;

import com.mrq.kafka.pubsub.poc.models.UserModel;
import org.apache.kafka.clients.producer.Producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@EnableKafka
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(Producer.class);
    @KafkaListener(topics="users")
    public void consume(UserModel userModel){
        logger.info(String.format("#### -> Consumed message -> %s " , userModel.toString()));

    }
}
