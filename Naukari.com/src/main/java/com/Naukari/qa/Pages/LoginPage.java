package com.Naukari.qa.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Naukari.qa.Base.TestBase;

public class LoginPage extends TestBase {

	// Page Factory
	@FindBy(xpath = "//a[@title='Jobseeker Login']//div[@class='mTxt']")
	WebElement NaukariLogin;

	@FindBy(xpath = "//input[@name='email']")
	WebElement NaukariEmail;

	@FindBy(xpath = "//input[@name='PASSWORD']")
	WebElement NaukariPassword;

	@FindBy(xpath = "//button[@value='Login']")
	WebElement NaukariLoginButton;

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	public HomePage NaukariLogin(String id, String pass) throws InterruptedException {
		
		NaukariLogin.click();
		
		Thread.sleep(3000);

		NaukariEmail.clear();
		NaukariEmail.sendKeys(id);

		NaukariPassword.clear();
		NaukariPassword.sendKeys(pass);

		Thread.sleep(3000);

		NaukariLoginButton.click();

		return new HomePage();

	}

}
