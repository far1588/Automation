package qsp;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAssertion1 {

	@Test
	public void verifytilee() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String atitle = "Google";
	 String etitle = driver.getTitle();
	 
	Assert.assertEquals(atitle, etitle);
	driver.quit();
	}
	
	
}
