package com.pinoyjavatech.sample;

import org.springframework.messaging.Message;

public class PrintJdbcResult {
	
	public void printJdbcResult(Message<?> message) {
		System.out.println(message.getPayload());
	}
}
