package com.Naukari.qa.Base;


import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.Naukari.qa.Util.TestUtil;
import com.Naukari.qa.Util.WebEventListener;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver evenfiringDriver;
	public static WebEventListener eventListener;

	public TestBase() {

		try {
			prop = new Properties();

			FileInputStream fin = new FileInputStream(
					
					"E:\\Maven\\Naukari.com\\src\\main\\java\\com\\Naukari\\qa\\Config\\config.properties");

			prop.load(fin);

		} catch (Exception e1) {

			e1.printStackTrace();
		}
	}

	public static void Intialization() {

		String browsername = prop.getProperty("browser");

		if (browsername.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "E:\\Webdrivers\\chromedriver.exe");

			driver = new ChromeDriver();

		}

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_TimeOut, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(TestUtil.Implicite_Wait, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));

		String parent = driver.getWindowHandle();

		Set<String> allWindows = driver.getWindowHandles();

		int count = allWindows.size();

		for (String child : allWindows) {

			if (!parent.equalsIgnoreCase(child)) {

				driver.switchTo().window(child);

				driver.close();
			}
		}

		driver.switchTo().window(parent);

		evenfiringDriver = new EventFiringWebDriver(driver);
		
		//Now Create Object of Event Listener Handler to register it with EventFiring driver
		eventListener = new WebEventListener();
		
		evenfiringDriver.register(eventListener);
		
		driver = evenfiringDriver;
		
	}

}
