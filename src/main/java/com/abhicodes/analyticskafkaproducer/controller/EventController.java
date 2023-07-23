package com.abhicodes.analyticskafkaproducer.controller;

import com.abhicodes.analyticskafkaproducer.producer.KafkaProducer;
import com.abhicodes.analyticskafkaproducer.vo.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/event")
public class EventController {
	
	@Autowired
	KafkaProducer kp;
	
	@PostMapping("/")
	public void createEmployee(@RequestBody Event ev) {
		kp.sendMessage(ev);
	}

}
