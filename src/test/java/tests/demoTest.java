package tests;

import java.time.Duration;

import org.testng.annotations.Test;

import base.BaseTest;

import org.openqa.selenium.WebDriver;

import utils.DriverFactory;

public class demoTest extends BaseTest {

	@Test
	public void test1() throws InterruptedException {
		WebDriver driver = getDriver();
		driver.get("https://ecommerce-playground.lambdatest.io/");
		System.out.println(driver.getCurrentUrl() + "--> test1 on chrome with ThreadID = " + Thread.currentThread().threadId());
	}

	@Test
	public void test2() throws InterruptedException {
		WebDriver driver = getDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getCurrentUrl() + "--> test2 on edge with ThreadID = " + Thread.currentThread().threadId());
	}

	@Test
	public void test3() throws InterruptedException {
		WebDriver driver = getDriver();
		driver.get("https://ecommerce-playground.lambdatest.io/");
		System.out.println(driver.getCurrentUrl() + "--> test3 on chrome with ThreadID = " + Thread.currentThread().threadId());
	}

	@Test
	public void test4() throws InterruptedException {
		WebDriver driver = getDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getCurrentUrl() + "--> test4 on edge with ThreadID = " + Thread.currentThread().threadId());
	}

}
