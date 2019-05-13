package com.Naukari.qa.Pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Naukari.qa.Base.TestBase;

public class HomePage extends TestBase {

	// Page Factory
	@FindBy(xpath = "//button[@class='col search l2 btn btn-mid']")
	WebElement SearchBox;

	@FindBy(xpath = "//input[@placeholder='Search jobs by Skills, Designation, Companies']")
	WebElement SearchJob;

	@FindBy(xpath = "//input[@placeholder='Location/Locality']")
	WebElement SearchLocality;

	@FindBy(xpath = "//input[@placeholder='Experience']")
	WebElement SearchExperience;

	@FindBy(xpath = "//a[@data-id='expDroope-experience_1']")
	WebElement SearchExperienceCount;

	@FindBy(xpath = "//input[@placeholder='Salary']")
	WebElement SearchSalary;

	@FindBy(xpath = "//a[@data-id='salaryDroope-salary_4']")
	WebElement SearchSalaryCount;

	@FindBy(xpath = "//button[contains(text(),'SEARCH')]")
	WebElement SearchButton;
	
	@FindBy(xpath= "//button[@id='trig1']")
	WebElement ApplyButton;

	public HomePage() {

		PageFactory.initElements(driver, this);
	}

	public void NaukariSearch() throws InterruptedException {

		SearchBox.click();

		Thread.sleep(3000);

		SearchJob.sendKeys("Automation Test Engineer");

		Thread.sleep(3000);

		SearchLocality.sendKeys("Pune");

		Thread.sleep(3000);

		SearchExperience.click();

		Thread.sleep(3000);

		SearchExperienceCount.click();

		Thread.sleep(3000);

		SearchSalary.click();

		Thread.sleep(3000);

		SearchSalaryCount.click();

		Thread.sleep(3000);

		SearchButton.click();

		Thread.sleep(3000);

		List<WebElement> list = driver.findElements(By.xpath("//a[@id='jdUrl']"));

		System.out.println("Total job Found : " + list.size());

		for (int i = 0; i < list.size() - 50; i++) {    

			list.get(i).click();

		}
		
		//It will return a parent window
		String parent = driver.getWindowHandle(); 
		
		Set<String> set = driver.getWindowHandles();
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			
			String child = itr.next();
			
			if(!parent.equals(child)) {
				
				driver.switchTo().window(child);
				
				try {
					
					if(ApplyButton.isDisplayed()) {
						
						ApplyButton.click();
						
					}
				}
				
				catch (Exception e) {
					
					e.printStackTrace();
				}
				
			}
			driver.switchTo().window(child);
			
			driver.close();
		} 

	}

}
