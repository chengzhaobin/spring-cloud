package com.chengzb.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import feign.Logger;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker//打开Hystrix断路器
public class ConsumerApplication {
	@Bean
	Logger.Level feignLoggerLevel(){
		return Logger.Level.FULL;
	}
public static void main(String[] args) {
	SpringApplication.run(ConsumerApplication.class, args);
}
}
