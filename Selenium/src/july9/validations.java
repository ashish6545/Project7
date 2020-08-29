package july9;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;

public class validations {

	public static void main(String[] args) throws InterruptedException {
		//setting chromedriver file location.
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashish\\Desktop\\selenium drivers\\chromedriver_win32\\Chromedriver.exe");
		
		//create a new instance of chrome driver.
		WebDriver driver=new ChromeDriver();
		
		//browsing url.
		driver.get("https://www.seleniumeasy.com/test/");
		Thread.sleep(3000);
		
		//implicit wait.
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS) ;
		
		//handling popup.
		driver.findElement(By.id("at-cv-lightbox-close")).click();
		
		//clicking on the input button.
		driver.findElement(By.className("dropdown-toggle")).click();
		Thread.sleep(3000);
		
		//explicit wait.
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement guru99seleniumlink;
		guru99seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#navbar-brand-centered > ul:nth-child(1) > li.dropdown.open > ul > li:nth-child(1) > a")));
		guru99seleniumlink.click();
		
		//storing all the windows in a set handles.
		Set<String> handles=driver.getWindowHandles();
		//using for loop to move to last window.
		for(String actual: handles) {
			driver.switchTo().window(actual);
		}
		
		//input value in textbox.
		driver.findElement(By.className("form-control")).sendKeys("ashish");
		Thread.sleep(1000);
		
		//clicking on button.
		driver.findElement(By.cssSelector("#get-input > button")).click();
		Thread.sleep(1000);
		
		//storing data in variable.
		String value=driver.findElement(By.id("display")).getText();
		
		//Assertion.
		//Assert.assertEquals("ashish",value);
		
		//validation using if statement.
		if((value).contains("ashish")){
		    System.out.println("pass");
		    System.out.println(value);
		}
		else{
		    System.out.println("not pass");
		}
		
		//input value in textbox.
		driver.findElement(By.id("sum1")).sendKeys("5");
		Thread.sleep(1000);
		driver.findElement(By.id("sum2")).sendKeys("8");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#gettotal > button")).click();
		Thread.sleep(1000);
		
		//validation using if statement.
		String values=driver.findElement(By.id("displayvalue")).getText();
				if((values).contains("13")){
				    System.out.println("pass");
				}
				else{
				    System.out.println("not pass");
				}
				
		//switching to main window.
		driver.get("https://www.seleniumeasy.com/test/");
		
		//clicking on date picker button.
		driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#navbar-brand-centered > ul:nth-child(1) > li.dropdown.open > ul > li:nth-child(1) > a")).click();
		
		//picking date.
		 WebElement dateBox = driver.findElement(By.cssSelector("#sandbox-container1 > div > input"));
		 dateBox.sendKeys("09/25/2013");
		 Thread.sleep(2000);
		
		 WebElement dateBox2 = driver.findElement(By.cssSelector(" #datepicker > input:nth-child(1)"));
		 dateBox2.sendKeys("09/25/2013");
		 Thread.sleep(2000);
		 
		 WebElement dateBox3 = driver.findElement(By.cssSelector(" #datepicker > input:nth-child(3)"));
		 dateBox3.sendKeys("12/28/2013"); 
		 Thread.sleep(2000);

		//browsing url.
		 driver.get("https://www.seleniumeasy.com/test/");
		 Thread.sleep(3000);
		 
		 //clicing on input button.
		 driver.findElement(By.className("dropdown-toggle")).click();
		Thread.sleep(3000);
		
		//clicking on the link.
		driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[7]/a")).click();
		Thread.sleep(2000);
		
		//selecting single value.
		 driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/span/span[1]/span")).click();
		 Thread.sleep(2000);
		 WebElement input=driver.findElement(By.cssSelector("body > span > span > span.select2-search.select2-search--dropdown > input"));
		 input.sendKeys("Aus");
		 Thread.sleep(2000);
		 input.sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
		 
		 //selecting multiple values.
		 WebElement input2=driver.findElement(By.cssSelector("body > div.container-fluid.text-center > div > div.col-md-6.text-left > div:nth-child(3) > div > div.panel-body > span > span.selection > span > ul > li > input"));
		 input2.sendKeys("ala");
		 Thread.sleep(2000);
		 input2.sendKeys(Keys.DOWN);
		 Thread.sleep(2000);
		 input2.sendKeys(Keys.ENTER);
		 input2.sendKeys("ari");
		 Thread.sleep(2000);
		 input2.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 
		 //selecting disabled values.
		 driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div/div[2]/span/span[1]/span/span[2]")).click();
		 Thread.sleep(2000);
		 WebElement input3=driver.findElement(By.cssSelector("body > span > span > span.select2-search.select2-search--dropdown > input"));
		 input3.sendKeys("gu");
		 Thread.sleep(2000);
		 input3.sendKeys(Keys.ENTER);
		 }

}
