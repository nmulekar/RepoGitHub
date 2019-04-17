package com.jbk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test2 {

	public static WebDriver driver;

	@BeforeSuite
	public static WebDriver setup_Browser() {

		driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver", "‪C:\\chromedriver.exe");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("file:///C:/Users/hp/Desktop/Offline%20Website/index.html");

		return driver;
	}

	@Test
	public void Valid_username_password() {

		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("kiran@gmail.com");

		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123456");

		driver.findElement(By.xpath("//*[@id='form']/div[3]/div/button")).click();

		System.out.println("Online");

		System.out.println("........................................");

	}

	@Test
	public void Verify_Url_DashBoard() {

		String act_url = driver.getCurrentUrl();

		System.out.println("Page title is : " + act_url);

		String exp_url = "file:///C:/Users/hp/Desktop/Offline%20Website/pages/examples/dashboard.html";

		Assert.assertEquals(act_url, exp_url);

		System.out.println("...........................................");
	}

}
