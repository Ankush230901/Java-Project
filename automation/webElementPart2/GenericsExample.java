package com.automation.webElementPart2;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Alice");
		list.add("Bob");
		for (String name : list) {
			System.out.print(name + " ");
		}
		System.out.println(".");
	}
}
