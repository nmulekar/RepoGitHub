package com.jbk.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.jbk.qa.Base.BaseClass;

public class AboutSirPage extends BaseClass{
	
	//Page Factory
 	@FindBy(xpath = "//div[@class='about']//h2[1]")
 	WebElement Line1;
 	
 	@FindBy(xpath = "//div[@class='about']//h2[2]")
 	WebElement Line2;
 	
 	@FindBy(xpath = "//div[@class='about']//h2[3]")
 	WebElement Line3;
 	
 	@FindBy(xpath = "//div[@class='about']//h2[4]")
 	WebElement Line4;
 	
 	@FindBy(xpath = "//div[@class='about']//h2[5]")
 	WebElement Line5;
 	
 	@FindBy(xpath = "//div[@class='about']//h2[6]")
 	WebElement Line6;
 	
 	@FindBy(xpath = "//div[@class='about']//h2[7]")
 	WebElement Line7;
 	
 	
 	

 	
 	

}
