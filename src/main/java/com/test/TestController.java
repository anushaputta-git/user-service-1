package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	DBConfigProperties dbcp;
	
	@GetMapping("/env-data")
	public String envData() {
		return "connection: "+dbcp.getConnection()+"\n host: "+dbcp.getHost()+"\n port: "+ dbcp.getPort();
	}

}
