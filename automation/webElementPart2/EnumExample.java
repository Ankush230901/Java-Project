package com.automation.webElementPart2;

enum Day{

	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}


public class EnumExample {

	public static void main(String[] args) {
		
		Day today = Day.FRIDAY;
		System.out.println("Today is : " + today);
		
		switch (today) {
		case MONDAY:
			System.out.println("Start of the work week!");
			break;
			
		case FRIDAY:
			System.out.println("weeken is near!");
			break;

			default:
				System.out.println("Today is a regular day.");
		}
		
	}
}
