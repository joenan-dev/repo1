package com.joe.simple.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by Enzo Cotter on 2019/11/29.
 */
@Component
@RabbitListener(queues = "simple-queue")//监听队列
public class SimpleConsumer {
    @RabbitHandler
    public void process(String context){
        System.out.println("从队列中取出消息"+context);
    }
}
