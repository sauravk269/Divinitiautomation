package utility;

import java.net.HttpURLConnection;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Brokenlink {
WebDriver driver;
public void verifybrokenlink() throws Exception{
	List<WebElement> element= driver.findElements(By.tagName("a"));
	for(int i=0; i<element.size();i++){
		WebElement list= element.get(i);
		String url=list.getAttribute("href");
		verifylinkActive(url);
		}
}
private void verifylinkActive(String linkurl) throws Exception {
	URL url= new URL(linkurl);
	HttpURLConnection con=(HttpURLConnection) url.openConnection();
	con.setConnectTimeout(3000);
	con.connect();
	if(con.getResponseCode()==200){
		System.out.println(linkurl+" "+con.getResponseMessage());
	}
	else{
		System.out.println(linkurl+" ---Not getting correct response from the url please verify the url which you clicked ");
	}
}
}
