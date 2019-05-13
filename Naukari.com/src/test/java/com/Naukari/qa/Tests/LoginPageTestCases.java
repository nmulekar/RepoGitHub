package com.Naukari.qa.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Naukari.qa.Base.TestBase;
import com.Naukari.qa.Pages.HomePage;
import com.Naukari.qa.Pages.LoginPage;

public class LoginPageTestCases extends TestBase {

	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTestCases() {

		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {

		Intialization();

		loginPage = new LoginPage();

	}

	@Test
	public void TestLogin() throws InterruptedException {

		homePage = loginPage.NaukariLogin(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void CloseSetUp() {

		driver.quit();

		System.out.println("*******Closing*********");
	}
}
