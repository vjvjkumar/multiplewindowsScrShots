package Pack1;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Screenshots {
	@Test
	public void popupwindow() throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://sites.google.com/site/appsscripttutorial/user-interface/list-box");
		Thread.sleep(3000);	
		
		//take screenshots
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("V:/WorkSpace/testfile.jpg"));
		
	}

}
