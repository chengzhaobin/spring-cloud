package com.chengzb.spring.rabbitmq;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

@Component
public class Sender {
@Resource
private AmqpTemplate amqpTemplate;
public void send() {
	String context="hello "+new Date();
	System.out.println("sender:"+context);
	amqpTemplate.convertAndSend("test",context);
}
}
