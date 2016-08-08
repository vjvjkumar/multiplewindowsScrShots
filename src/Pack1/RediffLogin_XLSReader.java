package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import Pack2.XLS_Reader;

public class RediffLogin_XLSReader {

	@Test
	public void RediffLoginXLSreader() throws InterruptedException{
		
		XLS_Reader xls = new XLS_Reader("V:/testfile/mytestdata.xlsx");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://rediff.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login1")).sendKeys(xls.getCellData("testdata", 1,2));
		driver.findElement(By.id("password")).sendKeys(xls.getCellData("testdata", 2, 2));
		driver.findElement(By.name("proceed")).click();
		
		
	}

}
