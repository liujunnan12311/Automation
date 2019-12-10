package SeleniumAutomation.AutomationTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGDemTest {
	@BeforeClass
	public void setup()
	{
		
		System.out.print("begin test");
	}
	
	@Test
	public void testAdd() {
        String str = "TestNG is working fine";
        System.out.print(str);
    }

}
