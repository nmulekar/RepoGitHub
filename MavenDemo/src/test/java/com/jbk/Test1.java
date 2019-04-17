package com.jbk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test1 {

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
	public void click_OnUser() throws Exception {

		driver.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a/span")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@class='label label-danger']")).click();

		@SuppressWarnings("unused")
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();

	}

}
