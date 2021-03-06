package com.lyas.di_vs_ioc.without_di;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Dictionary {
	
	private final List<String> words = Arrays.asList("hello", "hi", "world", "how", "are", "you");
	
	public List<String> getWordsContaining(String aWord) {
		return words.stream().filter(word -> word.contains(aWord)).collect(Collectors.toList());
	}
	

}
