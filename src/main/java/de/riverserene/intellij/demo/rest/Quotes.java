package de.riverserene.intellij.demo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Quotes {

	private List<String> quotes;
	
	public Quotes() {
		if (quotes == null) {
			quotes = new ArrayList<>();
		}
	}
	
	public String quotes() {
		return quotes.toString();
	}
	
}
