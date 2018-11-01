package com.tutorialspoint;
import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	private SpellChecker spellChecker;
	@Autowired
	public TextEditor(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	public void spellCheck() {
		this.spellChecker.spellCheck();
	}
}
