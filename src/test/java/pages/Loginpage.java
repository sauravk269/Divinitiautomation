package pages;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.testng.annotations.DataProvider;

import factory.DataProviderFactory;

public class Loginpage {
	WebDriver driver;
	public Loginpage(WebDriver driver){
		this.driver=driver;
	}
	@FindBy(xpath=".//*[@id='header']/div/div[1]/div/ul/li[3]/a")public WebElement linklogin;
	@FindBy(xpath=".//*[@id='email']")public WebElement linkemail;
	@FindBy(xpath=".//*[@id='pass']")public WebElement linkpassword;
	@FindBy(xpath=".//*[@id='send2' and@type='submit']")public WebElement submit_clk;
	public void signinclick(){  
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(linklogin.isEnabled()){
			if(linklogin.isDisplayed()){
				linklogin.click();
			}
		}


	}
	public void enteremail(String email) throws InterruptedException{
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(linkemail.isEnabled()){
			if(linkemail.isDisplayed()){
				linkemail.sendKeys(email);
			}
		}

	}
	public void enterpassword(String password){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(linkpassword.isEnabled()){
			if(linkpassword.isEnabled()){
				linkpassword.sendKeys(password);
			}
		}

	}
	public void clicksubmit() throws InterruptedException{
		Thread.sleep(1000);
		submit_clk.click();
	}

	public void credentials(String mailid, String pass) throws InterruptedException{
		signinclick();
		enteremail(mailid);
		enterpassword(pass);
		clicksubmit();
	}
@DataProvider(name="credentials")
	public static Object[][] fetchcredentils() throws Exception{
		int rows=DataProviderFactory.getexcel().gettotalrowcount(0);
		System.out.println("Total number of rows present in the excel are "+rows);
		Object[][]data= new Object[rows][2];
		for(int i=0;i<rows;i++){
			data[i][0]=DataProviderFactory.getexcel().getcellvalue(0,2,i);
			data[i][1]=DataProviderFactory.getexcel().getcellvalue(0, 3, i);
			System.out.println("Data that we are getting from the excel is "+data[i][0]);
			System.out.println("Data that we are getting from the excel is  "+data[i][1]);
		}
		return data;
	}
}