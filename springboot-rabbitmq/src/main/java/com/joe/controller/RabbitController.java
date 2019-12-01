package com.joe.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Enzo Cotter on 2019/11/29.
 */
@RestController
public class RabbitController {
    @Resource
    private AmqpTemplate amqpTemplate;

    @RequestMapping("simple")
    public String simple(String data){
        amqpTemplate.convertAndSend("simple-queue",data);
        return "success";
    }

    @RequestMapping("work")
    public String workSimple(){
        for (int i = 1 ;i <= 101;i++){
            amqpTemplate.convertAndSend("work-queue","message:"+i);
        }
        return "success";
    }

}
