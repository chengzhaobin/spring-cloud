package com.chengzb.provider.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@RequestMapping("/test")
public interface HelloService {
@RequestMapping("hello")
 String hello();
@RequestMapping(value="hello2",method=RequestMethod.GET)
public String hello2(@RequestParam("name")String name) ;


@RequestMapping(value="hello4",method=RequestMethod.POST)
public String hello4(User user) ;
}
