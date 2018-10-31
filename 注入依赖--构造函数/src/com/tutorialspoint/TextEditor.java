package com.tutorialspoint;

public class TextEditor {
	private SpellChecker checkSpell;
	public TextEditor(SpellChecker checkSpell) {
		this.checkSpell = checkSpell;
	}
//	public void setCheckSpell(SpellChecker checkSpell) {
//		this.checkSpell = checkSpell;
//	}
	public void checkSpell() {
		this.checkSpell.checkSpell();
	}
}
