package Pack2;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ExceptionTryCatch {
	@Test
	public void exception_IFCondition() throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		try{
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("vardhan.kg");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("testing123");
		driver.findElement(By.id("sign55In")).click();
		}catch(Throwable t){
			
			//take screenshots
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("D:/test/gmail.jpg"));
			System.out.println("Element not found: "+t);
		}
		driver.findElement(By.linkText("Forgot password?")).click();
	}

}
