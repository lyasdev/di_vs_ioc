package com.lyas.di_vs_ioc.without_di;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DictionaryTest {

	public final Dictionary instance = new Dictionary();
	
	@Test
	public void should_return_words_containing_h_test() {
		List<String> wordsContaingH = instance.getWordsContaining("h");
		Assertions.assertEquals("hello", wordsContaingH.get(0));
		Assertions.assertEquals("hi", wordsContaingH.get(1));
		Assertions.assertEquals("how", wordsContaingH.get(2));
	}
	
	@Test
	public void should_return_empty_list_test() {
		List<String> emptyListWords = instance.getWordsContaining("incorrect word");
		Assertions.assertTrue(emptyListWords.isEmpty());
	}
	
}
