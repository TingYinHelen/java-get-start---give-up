package com.tutorialspoint;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		context.start();
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		helloWorld.setMessage("Hello World!");
		helloWorld.getMessage();
		context.stop();
	}
}