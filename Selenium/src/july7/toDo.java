package july7;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class toDo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashish\\Desktop\\selenium drivers\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://webdriveruniversity.com/index.html");
		driver.findElement(By.id("to-do-list")).click();
		String StartingTab=driver.getWindowHandle();
		Set<String> handles=driver.getWindowHandles();
		for(String actual: handles) {
			driver.switchTo().window(actual);
		}
		driver.findElement(By.cssSelector("#container > input[type=text]")).sendKeys("selenium");
		driver.findElement(By.cssSelector("#container > ul > li:nth-child(1) > span > i")).click();
		Thread.sleep(2000);
		driver.switchTo().window(StartingTab);
		Thread.sleep(1000);
		driver.findElement(By.id("dropdown-checkboxes-radiobuttons")).click();
		Thread.sleep(1000);
		Set<String> handles2=driver.getWindowHandles();
		for(String actual: handles2) {
			driver.switchTo().window(actual);
		}
		driver.manage().window().maximize();
		Select Java = new Select(driver.findElement(By.id("dropdowm-menu-1")));
		Thread.sleep(1000);
		Java.selectByVisibleText("Python");
		Select Eclipse = new Select(driver.findElement(By.id("dropdowm-menu-2")));
		Thread.sleep(1000);
		Eclipse.selectByVisibleText("JUnit");
		Thread.sleep(1000);
		WebElement option1 = driver.findElement(By.cssSelector("#checkboxes > label:nth-child(1) > input[type=checkbox]"));
		option1.click();
		WebElement option2 = driver.findElement(By.cssSelector("#checkboxes > label:nth-child(5) > input[type=checkbox]"));
		option2.click();
		Thread.sleep(1000);
		WebElement radio1 = driver.findElement(By.cssSelector("#radio-buttons > input[type=radio]:nth-child(5)"));
		radio1.click();
		Thread.sleep(1000);
		WebElement radio2 = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(1)"));
		radio2.click();
		Thread.sleep(1000);
		Select fruit = new Select(driver.findElement(By.id("fruit-selects")));
		Thread.sleep(1000);
		fruit.selectByVisibleText("Apple");
		Thread.sleep(1000);
		fruit.selectByVisibleText("Pear");
		driver.close();
		
		
		
		
		
	}

}
