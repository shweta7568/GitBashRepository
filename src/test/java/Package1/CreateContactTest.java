package Package1;


import org.testng.annotations.Test;

public class CreateContactTest {

	@Test(groups ="SmokeTest")
	public void Test1() {
		System.out.println("First test of CreateContactTest");
		
	}
	
	@Test(groups ="RegressionTest")
	public void Test2() {
		System.out.println("Second test of CreateContactTest");
		
	}
}
