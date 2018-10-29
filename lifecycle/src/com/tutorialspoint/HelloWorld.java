package com.tutorialspoint;

public class HelloWorld {
	private String message;
	public void getMessage() {
		System.out.println(this.message);
	}
	public void setMessage(String value) {
		this.message = value;
	}
	public void init() {
		System.out.println("init");
	}
	public void destroy() {
		System.out.println("destroy");
	}
}
