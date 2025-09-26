package com.automation.webElementPart2;

interface GreetingHello{
	void sayHello();
}
public class LambdaExpression {

	public static void main(String[] args) {
		
		GreetingHello greet = () -> System.out.println("Hello from Lambda.");
		
		greet.sayHello();
	}
}
