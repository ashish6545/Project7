package july15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashish\\Desktop\\selenium drivers\\chromedriver_win32\\Chromedriver.exe");
			    driver=new ChromeDriver();
			    driver.get("https://www.google.com");
			    driver.manage().window().maximize();
			    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	
	//validation
	@Test(priority=3,groups="link")
	public void googleTitleTest()
	{
	String title=driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "google","title is wrong");
	}
	
	@Test(priority=2,groups="link")
	public void googleTitleTest2()
	{
	String title=driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Google","title is wrong");
	}
	
	
	
	@Test(priority=1,groups="logo")
	public void gmailLinkTest()
	{
		boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
		Assert.assertTrue(b);
	}
	
			    
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
			    
}
	


