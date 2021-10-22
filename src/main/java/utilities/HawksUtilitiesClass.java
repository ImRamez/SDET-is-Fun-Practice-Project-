package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import core.Base;

public class HawksUtilitiesClass extends Base {

	// we will create utility methods for our project.

	public static void takeScreenShot() throws IOException {
		// String for location path
		String path = System.getProperty("user.dir") + ".\\output\\screenshots";
		// we create object of File class assign value of getScreenShotAs method.
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// we use copyFile method of FileUtils class to copy screenshot captured and
		// store in location.
		// we defined in path.
		FileUtils.copyFile(file, new File(path + ".png"));
	}
	

}
