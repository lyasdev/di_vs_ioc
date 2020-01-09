package com.lyas.di_vs_ioc.ioc;

public class SpellChecker {
	
	private Dictionary dictionary;
	
	public SpellChecker(Dictionary aDictionary) {
		this.dictionary = aDictionary;
	}
	
	public boolean check(String word) {
		return dictionary.getWordsContaining(word).contains(word);
	}
}
