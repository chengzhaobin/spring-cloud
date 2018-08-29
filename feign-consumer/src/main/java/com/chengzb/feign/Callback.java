package com.chengzb.feign;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chengzb.provider.api.User;
@Service
@RequestMapping("fff")
public class Callback implements RefactorHelloService {

	@Override
	public String hello() {
		return "error hello";
	}

	@Override
	public String hello2(String name) {
		return "error hello2";
	}

	@Override
	public String hello4(User user) {
		return "error hello4";
	}

}
