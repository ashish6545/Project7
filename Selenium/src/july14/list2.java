package july14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class list2 {

	public static void main(String[] args) throws InterruptedException {
		
		//setting chrome driver file location.
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashish\\Desktop\\selenium drivers\\chromedriver_win32\\Chromedriver.exe");
		
		//create a new instance of chrome driver.
		WebDriver driver=new ChromeDriver();
		
		//browsing url.
		driver.get("https://www.seleniumeasy.com/test/");
		
		//maximizing window size.
		driver.manage().window().maximize();
		
		//implicit wait.
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
		//handling popup.
		driver.findElement(By.id("at-cv-lightbox-close")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
		//clicking on list box.
		WebElement listButton=driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[2]/li[3]/a"));
		//calling highlighter method.
		list1.highLighter(driver, listButton);
		listButton.click();
		
		//clicking on Bootstrap list Box.
		WebElement listButton2=driver.findElement(By.cssSelector("#navbar-brand-centered > ul.nav.navbar-nav.navbar-right > li.dropdown.open > ul > li:nth-child(1) > a"));
		list1.highLighter(driver, listButton2);
		listButton2.click();
		
		//click on first text box.
		WebElement listButton3=driver.findElement(By.xpath("//*[@id=\"listhead\"]/div[1]/div/input"));
		list1.highLighter(driver,listButton3);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		listButton3.sendKeys("boo");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//selecting checkbox.
		WebElement listButton4=driver.findElement(By.xpath("//*[@id=\"listhead\"]/div[2]/div/a"));
		list1.highLighter(driver, listButton4);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		listButton4.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//passing values.
		WebElement listButton5=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/button[2]"));
		list1.highLighter(driver, listButton5);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		listButton5.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//unchecking checkbox and clear textbox.
		list1.highLighter(driver, listButton4);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		listButton4.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		listButton3.clear();
		Thread.sleep(5000);
		
		// validation.
		WebElement listButton6=driver.findElement(By.xpath("//*[@id=\"listhead\"]/div[2]/div/input"));
		list1.highLighter(driver,listButton6);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(2000);
		listButton6.sendKeys("boo");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement listButton7=driver.findElement(By.xpath("//*[@id=\"listhead\"]/div[1]/div/a/i"));
		listButton7.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String value=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[3]/div/ul/li[6]")).getText();
		if(value.contentEquals("bootstrap-duallist"))
			System.out.println("value passed successfully");
		listButton6.clear();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		listButton7.click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//searching text  on second textbox.
		listButton6.sendKeys("cra");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
		//selecting checkbox.
		
		list1.highLighter(driver, listButton7);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		listButton7.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
		//passing values.
		WebElement listButton8=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/button[1]"));
		list1.highLighter(driver, listButton8);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		listButton8.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
		//unchecking checkbox.
		list1.highLighter(driver, listButton7);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		listButton7.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		listButton6.clear();
		
		

	}

}
