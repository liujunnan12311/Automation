package SeleniumAutomation.AutomationTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class SeleniumDemoTest {
	
	public static void main(String []args )
	{
		 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\vliu\\eclipse-workspace\\chromedriver.exe");
		    DesiredCapabilities ffDesiredcap= new DesiredCapabilities("Chrome", "78.0", Platform.WINDOWS);
		 WebDriver driver1;
		try {
			driver1 = new RemoteWebDriver(new URL("http://" + "remoteip" + ":4444/wd/hub"), ffDesiredcap);
			//WebDriver driver = new ChromeDriver();
			driver1.get("http://www.baidu.com");
			By by = By.id("kw");
			WebElement element = driver1.findElement(by);
			element.click();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
