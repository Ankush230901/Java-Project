package com.automation.webElementPart2;

import java.util.function.Function;


public class FunctionUseCaseAnonymous {

	public static void main(String[] args) {
		
		Function<String, Integer> getLength = new Function<String, Integer>() {

			public Integer apply(String str) {
				
				return str.length();
			}
		};
		
		System.out.println("Length of Sagar : " + getLength.apply("Sagar"));
		System.out.println("Length of Ankush k : " + getLength.apply("Ankush k"));
	}
}
