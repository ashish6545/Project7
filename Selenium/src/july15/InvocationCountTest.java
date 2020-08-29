package july15;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@Test(invocationCount=10)
	public void sum()
	{
		int a=5;
		int b=6;
		int c=a+b;
		System.out.println(c);
	}

}
