package testcases;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.Setupactivity;

public class Verifylogin {
	WebDriver driver;
	@BeforeMethod
	public void setup() throws Exception{
		driver=Setupactivity.setup();
	}
	@Test(priority=0)
	 public void login(){
		 
	 }

}
