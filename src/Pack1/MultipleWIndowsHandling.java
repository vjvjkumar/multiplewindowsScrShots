package Pack1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleWIndowsHandling {
	@Test
	public void popupwindow() throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.hdfcbank.com/");
		Thread.sleep(3000);	
		
		driver.findElement(By.linkText("Demat Account")).click();
		//To get the window ids we have to use java collections
		//Set and Iterator: these collections will print the window ids in the sort order
		
		Set<String> allwindowids=driver.getWindowHandles();		
		Iterator<String> iter=allwindowids.iterator();
		
		//to print window-ids
		/*while(iter.hasNext()){
			System.out.println(iter.next());
		}*/
		
		String mainwindow=iter.next();
		String popupwindow=iter.next();
		driver.switchTo().window(popupwindow);
		
		driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[1]/table/tbody/tr[2]/td[3]/input")).sendKeys("govardhan");
		
		driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[3]/input")).sendKeys("Karnati");
		driver.close();
		driver.switchTo().window(mainwindow);
		//driver.close();
		//driver.quit(); to close both the windows or all the windows
	}

}
