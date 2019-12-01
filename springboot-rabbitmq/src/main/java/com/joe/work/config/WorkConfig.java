package com.joe.work.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Enzo Cotter on 2019/11/29.
 */
@Configuration
public class WorkConfig {
    @Bean
    public Queue workQueue(){
        return new Queue("work-queue");
    }
}
