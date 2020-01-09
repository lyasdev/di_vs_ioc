package com.lyas.di_vs_ioc.di;

import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SpellCheckerTest {
	
	@Mock
	private Dictionary dictionary;
	
	private SpellChecker instance;
	
	@BeforeEach
	public void init() {
		instance = new SpellChecker(dictionary);
	}
	
	@Test
	public void should_return_true_for_english_dictionary_test() {
		when(dictionary.getWordsContaining("hello")).thenReturn(Arrays.asList("hello", "hello there"));
		Assertions.assertTrue(instance.check("hello"));
	}
	
	@Test
	public void should_return_true_for_french_dictionary_test() {
		when(dictionary.getWordsContaining("bonjour")).thenReturn(Arrays.asList("bonjour", "bonjour a tous"));
		Assertions.assertTrue(instance.check("bonjour"));
	}
	
	@Test
	public void should_return_false_test() {
		when(dictionary.getWordsContaining("incorrect word")).thenReturn(Collections.emptyList());
		Assertions.assertFalse(instance.check("incorrect word"));
	}
	
}
