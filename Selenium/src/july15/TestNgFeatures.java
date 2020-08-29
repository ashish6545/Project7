package july15;

import org.testng.annotations.Test;

public class TestNgFeatures {

	@Test
	public void loginTest()
	{
		System.out.println("login Test");
		int i=4/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void HomePageTest()
	{
		System.out.println("Home page");
	}
	
	
}
