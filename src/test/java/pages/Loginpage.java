package pages;

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
	@FindBy(xpath=".//a[text()='Login']")public WebElement linklogin;
	@FindBy(xpath=".//*[@id='email']")public WebElement linkemail;
	@FindBy(xpath=".//*[@id='pass']")public WebElement linkpassword;
	@FindBy(xpath=".//button[@type='submit']")public WebElement submit;
	public void signinclick(){
		linklogin.click();
	}
	public void enteremail(String email){
		linkemail.sendKeys(email);
	}
	public void enterpassword(String password){
		linkpassword.sendKeys(password);
	}
	
	public void credentials(String email, String password){
		enteremail(email);
		enterpassword(password);
	}
	public void clicksubmit(){
		submit.click();
	}

@DataProvider(name="credentials")
public static Object[][] fetchcredentils() throws Exception{
	int rows=DataProviderFactory.getexcel().gettotalrowcount(0);
	rows=rows-1;
	System.out.println("Total number of rows present in excel are..."+rows);
	Object[][]data= new Object[rows][2];
	for(int i=0;i<rows;i++){
	data[i-1][0]=DataProviderFactory.getexcel().getcellvalue(0,0, i);
	data[i-1][0]=DataProviderFactory.getexcel().getcellvalue(0, 1, i);
	}
	return data;
}
}