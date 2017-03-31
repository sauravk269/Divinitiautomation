package utility;

import org.openqa.selenium.WebDriver;

import factory.BrowserFactory;
import factory.DataProviderFactory;


public class Setupactivity {
	static WebDriver driver;
	public static WebDriver setup() throws Exception{
		driver=BrowserFactory.selectbrowser("firefox");
		driver.get(DataProviderFactory.configdata().getapplicationurl());
		return driver;
	}
}
