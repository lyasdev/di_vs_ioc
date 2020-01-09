package com.lyas.di_vs_ioc.without_di;

public class SpellChecker {
	
	private final Dictionary dictionary = new Dictionary();
	
	public boolean check(String word) {
		return dictionary.getWordsContaining(word).contains(word);
	}
}
