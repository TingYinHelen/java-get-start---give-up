package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.setMessage("木哈哈");
		obj.getMessage();
		HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
		obj2.getMessage();
	}
}
