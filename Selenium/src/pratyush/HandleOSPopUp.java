package pratyush;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleOSPopUp {
	
	//json-server --watch db.json

	WebDriver driver;

		public void invokeBrowser() throws AWTException {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ashish\\\\Desktop\\\\selenium drivers\\\\chromedriver_win32\\\\Chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			handleOSPopUp();
		}

		public void handleOSPopUp() throws AWTException {

			try {
				driver.get("https://www.ilovepdf.com/jpg_to_pdf");
				//driver.findElement(By.id("pickfiles")).sendKeys("C:\\Users\\HP\\Desktop\\New folder (2)\\pratyush.jpg");
				Thread.sleep(2000);
	 //open upload window
	WebElement upload=driver.findElement(By.id("pickfiles"));
	    upload.click();

	    //put path to your image in a clipboard
	    StringSelection ss = new StringSelection("C:\\Users\\Ashish\\Desktop\\Postman_Begniner_Guide.docx");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

	    //imitate mouse events like ENTER, CTRL+C, CTRL+V
	    Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
				System.out.println("hi");
				//driver.quit();
				//driver.findElement(By.id("processTask")).wait(5);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// driver.get("https://www.ilovepdf.com/jpg_to_pdf");
			//driver.findElement(By.id("pickfiles")).click();
			
			// System.out.println("hi");
		}

		public static void main(String[] args) throws AWTException {
			HandleOSPopUp obj = new HandleOSPopUp();
			obj.invokeBrowser();

}
}
