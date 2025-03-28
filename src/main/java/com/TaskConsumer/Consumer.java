package com.TaskConsumer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
	List<String>result = new ArrayList<>();
	@KafkaListener(topics = "${topicname}",groupId="Kafka_consumer1")
	
	public void recivemessage(String msg) {
		addMessage(msg);
	}
	private void addMessage(String m) {
		result.add(m);
	}
	public String getallMsg() {
		return result.toString();
	}
}
