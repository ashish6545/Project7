package Aug27;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrintAllLinks {
	
	public WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashish\\Desktop\\selenium drivers\\chromedriver_win32\\Chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://spicejet.com");
	}
	
	@Test
	public void allLinksPrinting()
	{
		List<WebElement> str=driver.findElements(By.tagName("a"));
		System.out.println(str.size());
		for(int i=0;i<str.size();i++)
		{
			System.out.println(str.get(i).getText());
		}
	}

}
