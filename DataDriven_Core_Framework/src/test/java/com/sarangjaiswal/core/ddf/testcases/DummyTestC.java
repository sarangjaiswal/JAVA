package com.sarangjaiswal.core.ddf.testcases;

import org.testng.annotations.Test;

import com.sarangjaiswal.core.ddf.base.BaseTest;

import junit.framework.Assert;

public class DummyTestC extends BaseTest{
	@Test(priority=1)
	public void TestA() throws InterruptedException{
		Thread.sleep(3000);
		System.out.println("In DummyTestC -> TestA");
		Assert.assertEquals("A", "B");
	}
	
	@Test(priority=2, dependsOnMethods={"TestA"})
	public void TestB() throws InterruptedException{
		Thread.sleep(3000);
		System.out.println("In DummyTestC -> TestB");
	}
	
	@Test(priority=3, dependsOnMethods={"TestA","TestB"})
	public void TestC() throws InterruptedException{
		Thread.sleep(3000);
		System.out.println("In DummyTestC -> TestC");
	}

}
