package testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Loginpage;
import utility.Setupactivity;

public class Verifylogin {
	WebDriver driver;
	Loginpage loginobj;
	@BeforeMethod
	public void setup() throws Exception{
		driver=Setupactivity.setup();
	}
	@Test(priority=0,dataProvider="credentials",dataProviderClass=Loginpage.class)
        public void callinglogin(String mail,String pass) throws InterruptedException{
		loginobj= new Loginpage(driver);
		loginobj=PageFactory.initElements(driver, Loginpage.class);
		loginobj.credentials(mail, pass);
	}
	@AfterMethod
	public void aftermethod(){
		driver.quit();
	}
}



