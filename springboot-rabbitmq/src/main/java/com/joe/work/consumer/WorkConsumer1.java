package com.joe.work.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by Enzo Cotter on 2019/11/29.
 */
@Component
@RabbitListener(queues = "work-queue")
public class WorkConsumer1 {
    @RabbitHandler
    public void process(String context){
        System.out.println("消费者1从队列中取出消息:"+context);
    }
}
