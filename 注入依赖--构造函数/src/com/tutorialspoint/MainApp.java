package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		TextEditor obj = (TextEditor) context.getBean("textEditor");
		obj.checkSpell();
//		SpellChecker checkSpell=new SpellChecker();
//		TextEditor textEditor=new TextEditor(checkSpell);
//		textEditor.checkSpell();
	}
}
