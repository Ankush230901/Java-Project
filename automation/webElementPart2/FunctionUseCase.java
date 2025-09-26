package com.automation.webElementPart2;

import com.google.common.base.Function;

public class FunctionUseCase {

	public static void main(String[] args) {
		Function<String, Integer> getLength = str -> str.length();
		
		System.out.println("Length of Hello : " + getLength.apply("Hello"));
		System.out.println("Length of Selenium : " + getLength.apply("Selenium"));
	}
}
