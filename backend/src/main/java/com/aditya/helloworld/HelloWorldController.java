package com.aditya.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aditya.helloworld.serverinfo.ServerInformationService;

@RestController
public class HelloWorldController {
	
	@Autowired
	private ServerInformationService serverInfo;
	
	@GetMapping(path = "/")
	public String helloWorld() {
		return "Hello World " + " V1 " + serverInfo.getServerInfo();
	}

}
