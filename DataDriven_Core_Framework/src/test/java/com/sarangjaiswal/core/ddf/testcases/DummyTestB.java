package com.sarangjaiswal.core.ddf.testcases;

import org.testng.annotations.Test;

import com.sarangjaiswal.core.ddf.base.BaseTest;

public class DummyTestB extends BaseTest{
	
	@Test
	public void TestA() throws InterruptedException{
		Thread.sleep(3000);
		System.out.println("In DummyTestB -> TestA");
	}
	
	@Test
	public void TestB() throws InterruptedException{
		Thread.sleep(3000);
		System.out.println("In DummyTestB -> TestB");
	}


}
