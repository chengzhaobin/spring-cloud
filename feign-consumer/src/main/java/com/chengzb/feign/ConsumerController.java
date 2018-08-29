package com.chengzb.feign;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chengzb.provider.api.User;


@RestController
public class ConsumerController {
@Resource
RefactorHelloService refactorHelloService;
@RequestMapping(value="/feign-consumer",method=RequestMethod.GET)
public String he() {
	return refactorHelloService.hello();
}
@RequestMapping(value="/feign-consumer2",method=RequestMethod.GET)
public String he2() {
	return refactorHelloService.hello2("name");
}
@RequestMapping(value="/feign-consumer3",method=RequestMethod.GET)
public String he5() {
	User user=new User("cheng",12);
	return refactorHelloService.hello4(user);
}
}
