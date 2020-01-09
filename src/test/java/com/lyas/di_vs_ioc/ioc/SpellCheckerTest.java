package com.lyas.di_vs_ioc.ioc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpellCheckerTest {
	
	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfiguration.class);
    SpellChecker instance = ctx.getBean(SpellChecker.class);
    
    @Test
	public void should_return_true_test() {
		Assertions.assertTrue(instance.check("hello"));
	}
	
	@Test
	public void should_return_false_test() {
		Assertions.assertFalse(instance.check("incorrect word"));
	}
    
	
}
