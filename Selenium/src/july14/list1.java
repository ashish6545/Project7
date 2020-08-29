package july14;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class list1 {
	
	public static void highLighter(WebDriver driver, WebElement element)
	{
		//creating javascriptExecutor reference.
	JavascriptExecutor js=(JavascriptExecutor)driver; 
	
	//highlighting clickable button with colour.
	js.executeScript("arguments[0].setAttribute('style', 'background: Red; border: 2px solid yellow;');", element);
	 
	try 
	{
	Thread.sleep(500);
	} 
	catch (InterruptedException e) {
	 
	System.out.println(e.getMessage());
	} 
	 
	js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element); 
	 
	}
	}


