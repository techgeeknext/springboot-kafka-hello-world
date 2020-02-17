package com.techgeeknext.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techgeeknext.service.KafkaProducer;

@RestController
@RequestMapping(value = "/techgeeknext-kafka/")
public class KafkaWebController {

	@Autowired
	KafkaProducer kafkaProducer;

	@GetMapping(value = "/producer")
	public String producer(@RequestParam("message") String message) {
		kafkaProducer.send(message);
		return "Message sent Successfully to the Kafka topic my-topic";	}
}

