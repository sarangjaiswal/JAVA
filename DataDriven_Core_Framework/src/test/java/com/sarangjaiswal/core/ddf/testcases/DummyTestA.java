package com.sarangjaiswal.core.ddf.testcases;

import org.testng.annotations.Test;

import com.sarangjaiswal.core.ddf.base.BaseTest;

public class DummyTestA extends BaseTest{
	@Test
	public void TestA() throws InterruptedException{
		Thread.sleep(3000);
		System.out.println("In DummyTestA -> TestA");
		OpenBrowser(getDatafromOR("browser"));
		navigate(getDatafromOR("app_url"));
		click(getDatafromOR("newslink_xpath"));
	}
	
	@Test
	public void TestB() throws InterruptedException{
		Thread.sleep(3000);
		System.out.println("In DummyTestA -> TestB");
	}

}
