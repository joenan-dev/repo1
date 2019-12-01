package com.joe.simple.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Enzo Cotter on 2019/11/29.
 */
@Configuration
public class SimpleConfig {
    @Bean
    public Queue queue(){
        return new Queue("simple-queue");
    }

}
