package com.tutorialspoint;
import org.springframework.context.annotation.*;

public class HelloWorld {
	private String message;
	public void setMessage(String value) {
		this.message = value;
	}
	public String getMessage() {
		System.out.println(this.message);
		return this.message;
	}
}
