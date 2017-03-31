package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BrowserFactory {
	static WebDriver driver;
	public static WebDriver selectbrowser(String browsername) throws Exception{
		if(browsername.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("chrome")){
			System.setProperty("Webdriver.chrome.driver","path");
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver","path");
			driver= new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;

	}
}
