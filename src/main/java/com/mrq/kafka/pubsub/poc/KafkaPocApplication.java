package com.mrq.kafka.pubsub.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;


@SpringBootApplication(exclude = KafkaAutoConfiguration.class)
public class KafkaPocApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaPocApplication.class, args);
    }

}
