package com.chengzb.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringCloudApplication
public class Application {
public static void main(String[] args) {
	SpringApplication.run(Application.class, args);
}
/**
 * 过滤器需要在spring容器内
 */
/*@Bean
public AccessFilter fi() {
	return new AccessFilter();
}*/
}
