package com.Naukari.qa.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Naukari.qa.Base.TestBase;
import com.Naukari.qa.Pages.HomePage;
import com.Naukari.qa.Pages.LoginPage;

public class HomePageTestCases extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {

		Intialization();

		loginPage = new LoginPage();
		homePage = loginPage.NaukariLogin(prop.getProperty("username"), prop.getProperty("password"));

	}
	
	@Test
	public void TestSearch() throws InterruptedException {

		homePage.NaukariSearch();
	}

	@AfterMethod
	public void CloseSetUp() {

		driver.quit();

		System.out.println("*******Closing*********");
	}

}
