package com.Naukari.qa.Util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Naukari.qa.Base.TestBase;

public class TestUtil extends TestBase{

	public static long Page_Load_TimeOut = 30;

	public static long Implicite_Wait = 30;

	public static void TakeScreenShotAtTheEnd() throws IOException {
	
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		
		String currentDirectory = System.getProperty("user.dir");
		
		FileUtils.copyFile(SrcFile, new File(currentDirectory + "/ScreenShots/" + System.currentTimeMillis() + ".png"));

	}

}
