package july15;

import org.testng.annotations.Test;

public class ExpectedExceptionTest {
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test1()
	{
		String x="100A";
		Integer.parseInt(x);
	}

}
