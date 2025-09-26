package com.automation.webElementPart2;

interface Greeting{
	void sayHello();
}
public class AnonymousClass {

	public static void main(String[] args) {
		
		Greeting greet = new Greeting() {
			
			@Override
			public void sayHello() {
				System.out.println("Hello from anonymous class");
				
			}
		};
		
		greet.sayHello();
	}
}
