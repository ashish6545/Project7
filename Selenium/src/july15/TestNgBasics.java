package july15;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {

	//pre-conditions annotation-----starting with @Before.
	@BeforeSuite //1
	public void setUp()
	{
		System.out.println("setup system property for chrome");
	}
	
	@BeforeClass //3
	public void  login()
	{
		System.out.println("login method ");
	}
	
	@BeforeTest //2
	public void launchBrowser()
	{
		System.out.println("launch chrome browser");
	}
	
	@BeforeMethod //4
	public void enterUrl()
	{
		System.out.println("enter url");
	}
	
	//test cases-----starting with @Test.
	@Test //5
	public void googleTitleTest()
	{
		System.out.println("google title test");
	}
	@Test
	public void search()
	{
		System.out.println("search");
	}
	
	//post-conditions-----starting with@After.
	@AfterMethod //6
	public void logOut()
	{
		System.out.println("logout from app");
	}
	
	@AfterTest //8
	public void deleteCookies()
	{
		System.out.println("delete all cookies");
	}
	
	@AfterClass //7
	public void closeBrowser()
	{
		System.out.println("Close Browser");
	}
	
	@AfterSuite //9
	public void generateTestReport()
	{
		System.out.println("generate test report");
	}
	
	
	
}
