package Pack2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Exception_IFCondition {
	@Test
	public void exception_IFCondition() throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		String title=driver.getTitle();
		if(title.equalsIgnoreCase("Google_Page")){
			System.out.println("Application Title is correct");
		}else{
			System.out.println("Application title wrong");
		}
		
		driver.get("http://quikr.com");
	}
}
