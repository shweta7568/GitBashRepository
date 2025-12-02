package Package1;

import org.testng.annotations.Test;

public class CreateOrgTest {
	@Test(groups ="SmokeTest")
	public void Test1() {
		System.out.println("First test of CreateOrgTest");
		
	}
	
	@Test(groups ="RegressionTest")
	public void Test2() {
		System.out.println("Second test of CreateOrgTest");
		
	}

}
