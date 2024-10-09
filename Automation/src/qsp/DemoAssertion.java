package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoAssertion {


@Test
public void verifytitle() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	String etitle="soos";
	String atitle=driver.getTitle();
	if(atitle.equals(etitle))
	{
		Reporter.log("title is matching and pass",true);
	}else {
		Reporter.log("title is not matching and fail",true);
	
}
driver.quit();
	
	
}
	
}
