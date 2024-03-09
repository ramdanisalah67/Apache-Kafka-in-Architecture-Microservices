package com.example.demo.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.internals.Topic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class Topics {

    @Bean
    public NewTopic Topic1(){
        return TopicBuilder.name("Topic-1")
                .build();
    }
}
