package SeleniumAutomation.AutomationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoSeleniumTest {
	@BeforeClass
	public void setup()
	{
		
		System.out.print("test demo 2");
	}
	@Test
	public void OpenHomePage()
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.baidu.com");
	}
}
