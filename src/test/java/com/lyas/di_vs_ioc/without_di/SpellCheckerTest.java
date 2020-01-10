package com.lyas.di_vs_ioc.without_di;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpellCheckerTest {
	
	private final SpellChecker instance = new SpellChecker();
	
	@Test
	public void should_return_true_test() {
		Assertions.assertTrue(instance.check("hello"));
	}
	
	@Test
	public void should_return_false_test() {
		Assertions.assertFalse(instance.check("incorrect word"));
	}
	
}
