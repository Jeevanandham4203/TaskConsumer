package com.TaskConsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/consumer")
public class TaskConsumercontroller {
	@Autowired
	Consumer c;
	
	@GetMapping("/getall")
	public String getallmsg() {
		return c.getallMsg();
	}
	
	
}
