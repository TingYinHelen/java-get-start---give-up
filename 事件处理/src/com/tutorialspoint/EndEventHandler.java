package com.tutorialspoint;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class EndEventHandler implements ApplicationListener<ContextStoppedEvent> {
	public void onApplicationEvent(ContextStoppedEvent event) {
		System.out.println("Stop......");
	}
}
