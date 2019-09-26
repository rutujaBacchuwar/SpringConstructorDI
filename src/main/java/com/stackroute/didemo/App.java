package com.stackroute.didemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stackroute.didemo.model.Message;

public class App {
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Message msg=(Message) context.getBean("message");
		msg.display();
	}

}
