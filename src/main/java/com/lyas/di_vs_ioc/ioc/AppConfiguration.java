package com.lyas.di_vs_ioc.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

	@Bean
	public Dictionary createDictionary() {
		return new EnglishDictionary();
	}
	
	@Bean
	public SpellChecker createSpellChecker() {
		return new SpellChecker(createDictionary());
	}
	
}
