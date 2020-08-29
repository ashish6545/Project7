package july13;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Table {

	public static void main(String[] args) throws InterruptedException {
		
		//creating object of scanner class.
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Assignee");
		
		//taking input.
		String input=sc.nextLine();
		
		//switch case.
		switch(input)
		{
		case "John Smith": System.out.println("Task is Wireframes and status is in-progress");
							break;
		case "Mike Trout": System.out.println("Task is Landing Page and status is in-progress");
							break;
		case "Loblab Dan": System.out.println("Task is SEO tags and status is failed qa"); 
							break;
		case "Emily John": System.out.println("Task is Bootstrap 3 and status is in progress");
							break;
		case "Holden Charles": System.out.println("Task is jQuery library and status is deployed");
							break;
		case "Jane Doe": System.out.println("Task is Browser Issues and status is failed qa");
							break;
		case "Kilgore Trout": System.out.println("Task is Bug fixing and status is in-progress");
							break;
		default: System.out.println("No Assignee with that name present");
		}
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashish\\Desktop\\selenium drivers\\chromedriver_win32\\Chromedriver.exe");
		
		//create a new instance of chrome driver.
		WebDriver driver=new ChromeDriver();
		
		//browsing url.
		driver.get("https://www.seleniumeasy.com/test/");
		
		Thread.sleep(5000);
		
		//handling popup.
		driver.findElement(By.id("at-cv-lightbox-close")).click();
		
		//clicking on table link.
		driver.findElement(By.cssSelector("#navbar-brand-centered > ul:nth-child(1) > li:nth-child(3) > a")).click();
		Thread.sleep(2000);
		
		//clicking on table data search link.
		driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[3]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		
		//entering data.
		driver.findElement(By.id("task-table-filter")).sendKeys(input);
		Thread.sleep(2000);
		
		//clicking on filter button.
		driver.findElement(By.cssSelector("body > div.container-fluid.text-center > div > div.col-md-6.text-left > div:nth-child(3) > div > div > div > button")).click();
		Thread.sleep(2000);
		
		//entering datas.
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/table/thead/tr/th[1]/input")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/table/thead/tr/th[1]/input")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/table/thead/tr/th[2]/input")).sendKeys("jacobs");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/table/thead/tr/th[2]/input")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/table/thead/tr/th[3]/input")).sendKeys("Brigade");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/table/thead/tr/th[3]/input")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/table/thead/tr/th[4]/input")).sendKeys("Kathaniko");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/table/thead/tr/th[4]/input")).clear();
		Thread.sleep(2000);
		
		//clicking on sliding bars link.
		driver.findElement(By.cssSelector("#navbar-brand-centered > ul.nav.navbar-nav.navbar-right > li:nth-child(1) > a")).click();
		Thread.sleep(2000);
		
		//clicking on drag and drop bars.
		driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[2]/li[1]/ul/li[3]/a")).click();
		
		 WebElement mover1=driver.findElement(By.xpath("//*[@id=\"slider1\"]/div/input"));
		 
		  // Action class object creation.
	     Actions action = new Actions(driver);
	     
	     // moving slider.
	     action.dragAndDropBy(mover1, 10, 98).build().perform();
	     
	     Thread.sleep(2000);
		 WebElement mover2=driver.findElement(By.xpath("//*[@id=\"slider2\"]/div/input"));


	     Actions action1 = new Actions(driver);
	     
	     action1.dragAndDropBy(mover2, 50, 100).build().perform();
	     
	     
	     Thread.sleep(2000);
		 WebElement mover3=driver.findElement(By.xpath("//*[@id=\"slider3\"]/div/input"));
		 Actions action2 = new Actions(driver);
	     action2.dragAndDropBy(mover3, -90, -50).build().perform();
	     
	     
	     
	     Thread.sleep(2000);
		 WebElement mover4=driver.findElement(By.xpath("//*[@id=\"slider4\"]/div/input"));
	     Actions action3 = new Actions(driver);
	     action3.dragAndDropBy(mover4, 70, 0).build().perform();
	     
	     
	     
	     Thread.sleep(2000);
		 WebElement mover5=driver.findElement(By.xpath("//*[@id=\"slider5\"]/div/input"));
	     Actions action4 = new Actions(driver);
	     action4.dragAndDropBy(mover5, 80, 0).build().perform();
	     
	     
	     Thread.sleep(2000);
		 WebElement mover6=driver.findElement(By.xpath("//*[@id=\"slider6\"]/div/input"));
	     Actions action5 = new Actions(driver);
	     action5.dragAndDropBy(mover6, 50, 20).build().perform();
	     
	  
	     
		
		
		
	}

}
