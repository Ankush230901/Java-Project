package com.automation.testNG;

import org.testng.annotations.Test;

public class GroupingExample02 {

	@Test(groups = {"regression"})
	public void smokeTest1() {
		System.out.println("group 2 regression test 1");
	}
	
	@Test(groups = {"regression"})
	public void smokeTest2() {
		System.out.println("group 2 regression test 2");
	}
	
	@Test(groups = {"smoke"})
	public void smokeTest3() {
		System.out.println("group 2 smoke test 3");
	}
}
