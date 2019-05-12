package com.jbk.qa.Base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.jbk.qa.Util.TestUtil;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;

	public BaseClass() {
		try {
			prop = new Properties();

			FileInputStream fin = new FileInputStream(
					"E:\\Maven\\JBK_Offline\\src\\main\\java\\com\\jbk\\qa\\Config\\config.properties");

			prop.load(fin);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void Intialization() {

		String browsername = prop.getProperty("browser");

		if (browsername.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver","E:\\Maven\\JBK_Offline\\src\\main\\java\\com\\jbk\\qa\\Driver\\chromedriver.exe");
			
			driver = new ChromeDriver();

		}

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_TimeOut, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(TestUtil.Implicite_Wait, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));
	}
}
