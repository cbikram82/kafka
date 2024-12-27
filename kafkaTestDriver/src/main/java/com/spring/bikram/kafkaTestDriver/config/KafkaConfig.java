package com.spring.bikram.kafkaTestDriver.config;

import com.spring.bikram.kafkaTestDriver.constant.AppConstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topic(){

        return TopicBuilder
                .name(AppConstant.DRIVER_LOCATION)
                .build();
    }
}
