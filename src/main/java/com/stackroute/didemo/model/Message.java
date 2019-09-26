package com.stackroute.didemo.model;

public class Message {
	private String message;

	public Message(String message) {
		super();
		this.message = message;
	}

	public void display() {
		System.out.println("Message is:"+message);
	}
}
