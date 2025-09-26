package com.automation.testNG;

import javax.swing.GroupLayout.Group;

import org.testng.annotations.Test;

public class GroupingExample01 {

	@Test(groups = {"smoke"})
	public void smokeTest1() {
		System.out.println("group 1 smoke test 1");
	}
	
	@Test(groups = {"smoke"})
	public void smokeTest2() {
		System.out.println("group 1 smoke test 2");
	}
	
	@Test(groups = {"regression"})
	public void smokeTest3() {
		System.out.println("group 1 regression test 3");
	}
}
