package com.chengzb.provider;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chengzb.provider.api.HelloService;
import com.chengzb.provider.api.User;

@RestController
public class ReFactorHelloController implements HelloService{

	@Override
	public String hello() {
		return "refactor hello";
	}

	@Override
	public String hello2(@RequestParam String name) {
		return "refactor hello2"+name;
	}
	@Override
	public String hello4(@RequestBody User user) {
		 return "hello44Fac--name--"+user.getName()+"--age:--"+user.getAge();
	}

}
