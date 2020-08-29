package july6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginValidation {

	public static void main(String[] args)throws InterruptedException, AWTException {
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Ashish\\Desktop\\selenium drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//WebDriver driver1=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashish\\Desktop\\selenium drivers\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://webdriveruniversity.com/index.html");
		driver.findElement(By.id("login-portal")).click();
		String StartingTab=driver.getWindowHandle();
		Set<String> handles=driver.getWindowHandles();
		for(String actual: handles) {
			driver.switchTo().window(actual);
		}
		driver.findElement(By.id("text")).sendKeys("webdriver");
		driver.findElement(By.id("password")).sendKeys("webdriver123");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		Alert popup=driver.switchTo().alert();
		popup.accept();
		driver.switchTo().window(StartingTab);
		driver.findElement(By.id("button-clicks")).click();
		//String StartingTab2=driver.getWindowHandle();
		Set<String> handles2=driver.getWindowHandles();
		for(String actual: handles2) {
			driver.switchTo().window(actual);
		}
		driver.findElement(By.id("button1")).click();
		 Robot robot = new Robot();
		 driver.findElement(By.className("btn-btn-default"));
		 robot.keyPress(KeyEvent.VK_ENTER);
		//driver.switchTo().frame(driver.findElement(By.id("myModalClick")));
		//driver.switchTo().activeElement();
		//driver.switchTo().defaultContent();
		//driver.findElement(By.id("button2")).click();
	}

}
