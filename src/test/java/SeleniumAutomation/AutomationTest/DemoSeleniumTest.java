package SeleniumAutomation.AutomationTest;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoSeleniumTest {
	@BeforeClass
	public void setup()
	{
		
		Reporter.log("我马上要打开浏览器了");
	}
	@Test
	public void OpenHomePage()
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.baidu.com");
		Reporter.log("我马上要关闭浏览器了1111111111111111了");
		Reporter.log("我马上要关闭浏览器了2222222222222222222");
	    AssertJUnit.assertTrue(true);
	    Reporter.log("我马上要打开浏览器了");
	}
	
	@AfterMethod
	 public void afterMethod(ITestResult testResult){
        if (testResult.getStatus() == ITestResult.FAILURE){
            System.out.println("Failed: "+testResult.getMethod().getMethodName());
        }
        if (testResult.getStatus()==ITestResult.SUCCESS){
            System.out.println("Successed:"+testResult.getName());
        }
        
 
    }
}
