package june18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FlightBooking {
	
	 static WebDriver driver = null;
	
	 //configuration setting
	@BeforeSuite
	public void SetUp() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashish\\Desktop\\selenium drivers\\chromedriver_win32\\Chromedriver.exe");
		Properties property=new Properties();
		FileInputStream fis = new FileInputStream("E:\\java eclipse selenium + java\\Seleniumtasks\\src\\june18\\setupConfig.Properties");
		property.load(fis);
		if(property.getProperty("browser").contentEquals("chrome"))
		{
			 driver = new ChromeDriver();
		}
    	driver.get(property.getProperty("url"));
    	driver.manage().window().maximize();
    	Thread.sleep(5000);
    	driver.findElement(By.cssSelector(property.getProperty("selector"))).click();
	}
	
	//Selecting Round trip they One way.
	@Test(priority=1)
	public void Trip() throws IOException, InterruptedException
	{
		Properties property=new Properties();
		FileInputStream fis = new FileInputStream("E:\\java eclipse selenium + java\\Seleniumtasks\\src\\june18\\TripConfig.Properties");
		property.load(fis);
		driver.findElement(By.xpath(property.getProperty("round"))).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath(property.getProperty("oneWay"))).click();
		Thread.sleep(2000);
		
	}
	
	//Adding Source.
	@Test(priority=2)
	public void from() throws IOException, InterruptedException
	{
		Properties property=new Properties();
		FileInputStream fis = new FileInputStream("E:\\java eclipse selenium + java\\Seleniumtasks\\src\\june18\\TripConfig.Properties");
		property.load(fis);
		driver.findElement(By.xpath(property.getProperty("box1"))).click();
		WebElement input1=driver.findElement(By.xpath(property.getProperty("box2")));
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	input1.sendKeys(property.getProperty("data1"));
    	input1.sendKeys(Keys.ENTER);
    	Thread.sleep(3000);
    	input1.sendKeys(Keys.DOWN);
    	input1.sendKeys(Keys.ENTER);
    	Thread.sleep(2000);
	}
	
	//Adding from.
	@Test(priority=3)
	public void To() throws IOException, InterruptedException
	{
		Properties property=new Properties();
		FileInputStream fis = new FileInputStream("E:\\java eclipse selenium + java\\Seleniumtasks\\src\\june18\\TripConfig.Properties");
		property.load(fis);
		driver.findElement(By.xpath(property.getProperty("box3"))).click();
		WebElement input2=driver.findElement(By.xpath(property.getProperty("box4")));
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	input2.sendKeys(property.getProperty("data2"));
    	input2.sendKeys(Keys.ENTER);
    	Thread.sleep(3000);
    	input2.sendKeys(Keys.DOWN);
    	input2.sendKeys(Keys.ENTER);
    	Thread.sleep(2000);
	}
	
	//Datepicker.
	@Test(priority=4)
	public void date() throws IOException, InterruptedException
	{
		Properties property=new Properties();
		FileInputStream fis = new FileInputStream("E:\\java eclipse selenium + java\\Seleniumtasks\\src\\june18\\TripConfig.Properties");
		property.load(fis);

		driver.findElement(By.xpath(property.getProperty("Box5"))).click();
	   	  Thread.sleep(3000);
	   	   driver.findElement(By.xpath(property.getProperty("Box6"))).click(); 
	   	
	}
	
	//Adding no. of Passengers.
	@Test(priority=5)
	public void Travelleor() throws IOException, InterruptedException
	{
		Properties property=new Properties();
		FileInputStream fis = new FileInputStream("E:\\java eclipse selenium + java\\Seleniumtasks\\src\\june18\\TripConfig.Properties");
		property.load(fis);
		driver.findElement(By.xpath(property.getProperty("Box7"))).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath(property.getProperty("Box8"))).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath(property.getProperty("Box9"))).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath(property.getProperty("Box10"))).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath(property.getProperty("Box11"))).click();
		Thread.sleep(2000);
	}
	
	//clicking on search button.
	@Test(priority=6)
	public void search() throws InterruptedException, IOException
	{
		Properties property=new Properties();
		FileInputStream fis = new FileInputStream("E:\\java eclipse selenium + java\\Seleniumtasks\\src\\june18\\TripConfig.Properties");
		property.load(fis);
		driver.findElement(By.xpath(property.getProperty("Box12"))).click();
		Thread.sleep(2000);
		String MainWindow=driver.getWindowHandle();
		 for (String handle : driver.getWindowHandles()) {

			    driver.switchTo().window(handle);}
	}
	
	//Adding filters.
	@Test(priority=7)
	public void Filters() throws InterruptedException, IOException
	{
		Properties property=new Properties();
		FileInputStream fis = new FileInputStream("E:\\\\java eclipse selenium + java\\\\Seleniumtasks\\\\src\\\\june18\\\\filterConfig.Properties");
		property.load(fis);
		driver.findElement(By.xpath(property.getProperty("Box14"))).click();
		driver.findElement(By.xpath(property.getProperty("Box15"))).click();
		driver.findElement(By.xpath(property.getProperty("Box16"))).click();
		driver.findElement(By.cssSelector(property.getProperty("Box17"))).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath(property.getProperty("Box18"))).click();
		driver.findElement(By.xpath(property.getProperty("Box13"))).click();
		Thread.sleep(5000);
		WebElement mover=driver.findElement(By.xpath(property.getProperty("Box19")));
		Actions action = new Actions(driver);
		action.dragAndDropBy(mover, 70,00).build().perform();
		Thread.sleep(9000);
		
	}
	
	//Closing driver.
	@AfterSuite
	public void end()
	{
		driver.quit();
	}
}
