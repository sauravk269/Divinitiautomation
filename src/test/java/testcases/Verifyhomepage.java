package testcases;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utility.Setupactivity;

public class Verifyhomepage {
	WebDriver driver;
	@BeforeMethod
	public void callingsetup() throws Exception{
		driver=Setupactivity.setup();
	}
	@Test(priority=0)
	public void verifyhomepage() {
		String title= driver.getTitle();
		System.out.println("Title of the page is "+title);
		Assert.assertTrue(title.contains("Online Gift Shop"));

	}
	@AfterMethod
	public void after(){
		driver.quit();

	}

}
