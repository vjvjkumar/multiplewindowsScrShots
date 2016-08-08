package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RediffRegistration {
	@Test
	public void popupwindow() throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[3]/td[3]/input")).sendKeys("Govardhan");
		driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[7]/td[3]/input[1]")).sendKeys("govardhan@rediff.com");
		driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[9]/td[3]/input")).sendKeys("testing123");
		driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).click();
		
		driver.findElement(By.xpath("//*[@id='mobno']")).sendKeys("8888888888");
		driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[24]/td[3]/select[1]")).sendKeys("04");
		driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[24]/td[3]/select[2]")).sendKeys("APR");
		driver.findElement(By.xpath("//*[@id='country']")).sendKeys("Aruba");
		driver.findElement(By.xpath("//*[@id='Register']")).click();
		
	}

}
