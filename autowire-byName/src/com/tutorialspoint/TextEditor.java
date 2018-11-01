package com.tutorialspoint;

public class TextEditor {
	private SpellChecker spellChecker;
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	public void spellCheck() {
		this.spellChecker.spellCheck();
	}
}
