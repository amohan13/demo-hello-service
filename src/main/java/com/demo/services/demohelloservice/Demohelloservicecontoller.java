package com.demo.services.demohelloservice;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class Demohelloservicecontoller {
	
	//@HystrixCommand(fallbackMethod="fallback")
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello not from hello service";
	}
	
	public String fallback() {
		return "Welcome to fallback";
	}
	

}
