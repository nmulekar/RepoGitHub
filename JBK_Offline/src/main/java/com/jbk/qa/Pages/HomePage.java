package com.jbk.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbk.qa.Base.BaseClass;

public class HomePage extends BaseClass {

	// Page Factory
	@FindBy(xpath = "//div[@id='mainleft' ] //h1")
	WebElement JbkLogo;

	@FindBy(xpath = "//div[@id='mainright' ] //h4[1]")
	WebElement OfficeEnquiry;

	@FindBy(xpath = "//div[@id='mainright' ] //h4[2]")
	WebElement WhatsAppNumber;

	@FindBy(xpath = "//div[@id='mainleft']//strong")
	WebElement TagLine;

	@FindBy(xpath = "//div[@id='mainleft']//a[@href='java-by-kiran-videos.html']")
	WebElement LiveVideosButton;

	@FindBy(xpath = "//a[@href='index.html']")
	WebElement HomeLink;

	@FindBy(xpath = "//a[@href='about-us.html']")
	WebElement AboutSirLink;

	@FindBy(xpath = "//li[@class='active']//a[@href='core-java-j2eee-syllabus.html']")
	WebElement JavaSyllabusLink;

	@FindBy(xpath = "//li[4]//a[@href='selenium-testing-in-pune.html']")
	WebElement SeleniumTestingLink;

	@FindBy(xpath = "//li//a[@href='java-by-kiran-videos.html']")
	WebElement VideosLink;

	@FindBy(xpath = "//a[@href='services.html']")
	WebElement ServicesLink;

	@FindBy(xpath = "//li[7]//a[@href='careers.html']")
	WebElement CareersLink;

	@FindBy(xpath = "//a[@href='gallery.html']")
	WebElement GalleryLink;

	@FindBy(xpath = "//a[@href='java-by-kiran-book.html']")
	WebElement MyBookLink;

	@FindBy(xpath = "//li[10]//a[@href='old-student-feedback-java-by-kiran.html']")
	WebElement OldStudentFeedbackLink;

	@FindBy(xpath = "//li[11]//a[@href='https://javabykiran.com/javabykiranfiles/']")
	WebElement ClassRoomExamplesLink;

	@FindBy(xpath = "//li[12]//a[@href='java-classes-contact-pune.html']")
	WebElement ContactLink;

	@FindBy(xpath = "//li[13]//a[@href='corejava-j2ee-selenium-testing-interview-question-answer.html']")
	WebElement InterviewQuestionsLink;

	@FindBy(xpath = "//li[14]//a[@href='tutorials.html']")
	WebElement TutorialsLink;

	@FindBy(xpath = "//li[16]//a[@href='corporate-training.html']")
	WebElement CorporateTrainingLink;

	public HomePage() {

		PageFactory.initElements(driver, this);

	}

	// Actions :
	public String VerifyHomePageTitle() {

		return driver.getTitle();
	}

	public boolean VerifyJbkLogo() {

		return JbkLogo.isDisplayed();

	}

	public boolean VerifyOfficeEnquiry() {

		return OfficeEnquiry.isDisplayed();
	}

	public boolean VerifyWhatsAppNumber() {

		return WhatsAppNumber.isDisplayed();
	}

	public boolean VerifyTagLine() {

		return TagLine.isDisplayed();
	}

	public void VerifyLiveVideosButtonLink() {

		LiveVideosButton.click();
	}

	public boolean VerifyHomeLink() {

		return HomeLink.isDisplayed();
	}

	public boolean VerifyAboutSirLink() {

		return AboutSirLink.isDisplayed();

	}

	public boolean VerifyJavaSyllabusLink() {

		return JavaSyllabusLink.isDisplayed();
	}

	public boolean VerifySeleniumTestingLink() {

		return SeleniumTestingLink.isDisplayed();
	}

	public boolean VerifyVideosLink() {

		return VideosLink.isDisplayed();
	}

	public boolean VerifyServicesLink() {

		return ServicesLink.isDisplayed();
	}

	public boolean VerifyCareersLink() {

		return CareersLink.isDisplayed();
	}

	public boolean VerifyGalleryLink() {

		return GalleryLink.isDisplayed();
	}

	public boolean VerifyMyBookLink() {

		return MyBookLink.isDisplayed();
	}

	public boolean VerifyOldStudentFeedbackLink() {

		return OldStudentFeedbackLink.isDisplayed();
	}

	public boolean VerifyClassRoomExamplesLink() {

		return ClassRoomExamplesLink.isDisplayed();
	}

	public boolean VerifyContactLink() {

		return ContactLink.isDisplayed();
	}

	public boolean VerifyInterviewQuestionsLink() {

		return InterviewQuestionsLink.isDisplayed();
	}

	public boolean VerifyTutorialsLink() {

		return TutorialsLink.isDisplayed();
	}

	public boolean VerifyCorporateTrainingLink() {

		return CorporateTrainingLink.isDisplayed();

	}

	// ================================Click===================================

	public AboutSirPage ClickAboutSirPage() {

		AboutSirLink.click();

		return new AboutSirPage();

	}

	public JavaSyllabusPage ClickJavaSyllabusPage() {

		JavaSyllabusLink.click();

		return new JavaSyllabusPage();

	}

	public SeleniumTestingPage ClickSeleniumTestingPage() {

		SeleniumTestingLink.click();

		return new SeleniumTestingPage();

	}

	public VideosPage ClickVideosPage() {

		VideosLink.click();

		return new VideosPage();

	}

	public ServicesPage ClickServicesPage() {

		ServicesLink.click();

		return new ServicesPage();

	}

	public CareersPage ClickCareersPage() {

		CareersLink.click();

		return new CareersPage();

	}

	public GalleryLPage ClickGalleryPage() {

		GalleryLink.click();

		return new GalleryLPage();

	}

	public OldStudentFeedbackLPage ClickOldStudentFeedbackPage() {

		OldStudentFeedbackLink.click();

		return new OldStudentFeedbackLPage();

	}

	public ClassRoomExamplesLPage ClickClassRoomExamplesPage() {

		ClassRoomExamplesLink.click();

		return new ClassRoomExamplesLPage();

	}

	public ContactPage ClickContactPage() {

		ContactLink.click();

		return new ContactPage();

	}

	public InterviewQuestionsPage ClickInterviewQuestionsPage() {

		InterviewQuestionsLink.click();

		return new InterviewQuestionsPage();

	}

	public TutorialsPage ClickTutorialsPage() {

		TutorialsLink.click();

		return new TutorialsPage();

	}

	public CorporateTrainingPage ClickCorporateTrainingPage() {

		CorporateTrainingLink.click();

		return new CorporateTrainingPage();

	}

	// ================================ Get Text ===================================

	public String GetText_Home() {

		String str = HomeLink.getText();

		return str;

	}

	public String GetText_AboutSir() {

		String str = AboutSirLink.getText();

		return str;

	}

	public String GetText_JavaSyllabus() {

		String str = JavaSyllabusLink.getText();

		return str;

	}

	public String GetText_SeleniumTesting() {

		String str = SeleniumTestingLink.getText();

		return str;

	}

	public String GetText_Videos() {

		String str = VideosLink.getText();

		return str;
	}

	public String GetText_Services() {

		String str = ServicesLink.getText();

		return str;
	}

	public String GetText_Careers() {

		String str = CareersLink.getText();

		return str;
	}

	public String GetText_Gallery() {

		String str = GalleryLink.getText();

		return str;
	}

	public String GetText_OldStudentFeedback() {

		String str = OldStudentFeedbackLink.getText();

		return str;
	}

	public String GetText_ClassRoomExamples() {

		String str = ClassRoomExamplesLink.getText();

		return str;

	}

	public String GetText_Contact() {

		String str = ContactLink.getText();

		return str;

	}

	public String GetText_InterviewQuestions() {

		String str = InterviewQuestionsLink.getText();

		return str;

	}

	public String GetText_Tutorials() {

		String str = TutorialsLink.getText();

		return str;

	}

	public String GetText_CorporateTraining() {

		String str = CorporateTrainingLink.getText();

		return str;

	}

}
