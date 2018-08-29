package com.chengzb.feign;


import org.springframework.cloud.netflix.feign.FeignClient;

import com.chengzb.provider.api.HelloService;

@FeignClient(value="provider-services",fallback=Callback.class)
public interface RefactorHelloService extends HelloService{

}
