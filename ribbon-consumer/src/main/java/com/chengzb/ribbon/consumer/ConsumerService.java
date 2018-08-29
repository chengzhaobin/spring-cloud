package com.chengzb.ribbon.consumer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@Service
public class ConsumerService {
@Autowired
private RestTemplate restTemplate;
@HystrixCommand(fallbackMethod="back")
public String hello() {
	return restTemplate.getForEntity("http://PROVIDER-SERVICES/hello",String.class).getBody();
}
public String back() {
	return "error";
}
}
