package Aug27;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidateDropdowns {
	
	public WebDriver driver;
	
	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashish\\Desktop\\selenium drivers\\chromedriver_win32\\Chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://spicejet.com");
		Thread.sleep(5000);
	}
	
	@Test
	public void f()
	{
		driver.findElement(By.id("divpaxinfo")).click();
		List<WebElement> s=new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Adult\"]"))).getOptions();
		System.out.println(s.size());
		for(int i=0;i<s.size();i++)
		{
			if(s.get(i).getText().equalsIgnoreCase("5"))
			{
				System.out.println(s.get(i).getText());
				new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText(s.get(i).getText());
				
			}
		}
		
		for(int i=0;i<s.size();i++)
		{
			if(!s.get(i).getText().equalsIgnoreCase("5"))
			{
				System.out.println(s.get(i).getText());
			}
		}
	}
	
	@AfterTest
	public void exit() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}

}
