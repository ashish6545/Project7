package july9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class redBus {

	public static void main(String[] args) throws InterruptedException {
		//setting chromedriver file location.
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashish\\Desktop\\selenium drivers\\chromedriver_win32\\Chromedriver.exe");
				
				//create a new instance of chrome driver.
				WebDriver driver=new ChromeDriver();
				
				//browsing url.
				driver.get("https://www.redbus.in/");
				 driver.findElement( By.id("src")).sendKeys("Dhanbad");
				//Select Java = new Select(driver.findElement(By.id("src").sendKeys("Dhan")));
				//Thread.sleep(1000);
				//Java.selectByVisibleText("Dhanbad");
				//dynamic wait
				//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

	}

}
