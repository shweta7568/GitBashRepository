package Package1;


import org.testng.annotations.Test;

public class CreateContactTest {

	@Test(groups ="SmokeTest")
	public void Test1() {
		System.out.println("First test of CreateContactTest");
		System.out.println(System.getProperty("Browser"));
		System.out.println(System.getProperty("Url"));
		
	}
	
	@Test(groups ="RegressionTest")
	public void Test2() {
		System.out.println("Second test of CreateContactTest");
		
	}
}
