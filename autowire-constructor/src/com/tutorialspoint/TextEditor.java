package com.tutorialspoint;

public class TextEditor {
	private SpellChecker spellChecker;
	public TextEditor(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	public void spellCheck() {
		this.spellChecker.spellCheck();
	}
}
