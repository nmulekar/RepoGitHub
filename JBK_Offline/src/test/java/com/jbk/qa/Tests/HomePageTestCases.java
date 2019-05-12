package com.jbk.qa.Tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.qa.Base.BaseClass;
import com.jbk.qa.Pages.HomePage;
import com.jbk.qa.Util.TestUtil;

public class HomePageTestCases extends BaseClass {

	HomePage homePage;

	TestUtil testutil;

	public HomePageTestCases() {

		super();
	}

	@BeforeSuite
	public void SetUp() {

		Intialization();
		homePage = new HomePage();

	}

	// Actions :
	@Test(priority = 1)
	public void ValidateLoginPageTitle() {

		String VerifyHomePageTitle = homePage.VerifyHomePageTitle();

		String actual = "Best Industrial Java Classes | Selenium Training in Pune";

		Assert.assertEquals(actual, VerifyHomePageTitle);

	}

	@Test(priority = 2)
	public void ValidateJbkLogo() {

		boolean logo = homePage.VerifyJbkLogo();

		Assert.assertTrue(logo);

	}

	@Test(priority = 3)
	public void ValidateOfficeEnquiry() {

		boolean officeEnquiry = homePage.VerifyOfficeEnquiry();

		Assert.assertTrue(officeEnquiry);
	}

	@Test(priority = 4)
	public void ValidateWhatsAppNumber() {

		boolean WhatsAppNumber = homePage.VerifyWhatsAppNumber();

		Assert.assertTrue(WhatsAppNumber);

	}

	@Test(priority = 5)
	public void ValidateTagLine() {

		boolean tagLine = homePage.VerifyTagLine();

		Assert.assertTrue(tagLine);
	}

	@Test(priority = 6)
	public void ValidateLiveVideosButton() {

		homePage.VerifyLiveVideosButtonLink();

	}

	@Test(priority = 7)
	public void ValidateHomeLink() {

		boolean Home = homePage.VerifyHomeLink();

		Assert.assertTrue(Home);
	}

	@Test(priority = 8)
	public void ValidateAboutSirLink() {

		boolean AboutSir = homePage.VerifyAboutSirLink();

		Assert.assertTrue(AboutSir);
	}

	@Test(priority = 9)
	public void ValidateJavaSyllabusLink() {

		boolean JavaSyllabus = homePage.VerifyJavaSyllabusLink();

		Assert.assertTrue(JavaSyllabus);
	}

	@Test(priority = 10)
	public void ValidateSeleniumTestingLink() {

		boolean SeleniumTesting = homePage.VerifySeleniumTestingLink();

		Assert.assertTrue(SeleniumTesting);
	}

	@Test(priority = 11)
	public void ValidateVideosLink() {

		boolean VideosLink = homePage.VerifyVideosLink();

		Assert.assertTrue(VideosLink);
	}

	@Test(priority = 12)
	public void ValidateServicesLink() {

		boolean Services = homePage.VerifyServicesLink();

		Assert.assertTrue(Services);
	}

	@Test(priority = 13)
	public void ValidateCareersLink() {

		boolean Careers = homePage.VerifyCareersLink();

		Assert.assertTrue(Careers);
	}

	@Test(priority = 14)
	public void ValidateMyBookLink() {

		boolean MyBook = homePage.VerifyMyBookLink();

		Assert.assertTrue(MyBook);
	}

	@Test(priority = 15)
	public void ValidateOldStudentFeedbackLink() {

		boolean OldStudentFeedback = homePage.VerifyOldStudentFeedbackLink();

		Assert.assertTrue(OldStudentFeedback);
	}

	@Test(priority = 16)
	public void ValidateClassRoomExamplesLink() {

		boolean ClassRoomExamples = homePage.VerifyClassRoomExamplesLink();

		Assert.assertTrue(ClassRoomExamples);
	}

	@Test(priority = 17)
	public void ValidateContactLink() {

		boolean Contact = homePage.VerifyContactLink();

		Assert.assertTrue(Contact);
	}

	@Test(priority = 18)
	public void ValidateInterviewQuestionsLink() {

		boolean InterviewQuestions = homePage.VerifyInterviewQuestionsLink();

		Assert.assertTrue(InterviewQuestions);
	}

	@Test(priority = 19)
	public void ValidateTutorialsLink() {

		boolean Tutorials = homePage.VerifyTutorialsLink();

		Assert.assertTrue(Tutorials);
	}

	@Test(priority = 20)
	public void ValidateCorporateTrainingLink() {

		boolean CorporateTraining = homePage.VerifyCorporateTrainingLink();

		Assert.assertTrue(CorporateTraining);
	}

}
