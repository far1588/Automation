package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closespecificbrowser {

	public static void main(String[] args) {
WebDriver driver= new ChromeDriver();
driver.get("https://secure.indeed.com/");
driver.findElement(By.id("login-google-button")).click();
WebElement apple = driver.findElement(By.id("apple-signin-button"));
apple.click();
String pwh = driver.getWindowHandle();
Set<String> allwh = driver.getWindowHandles();

for(String wh:allwh)
{
	driver.switchTo().window(wh);
	System.out.println(wh);
	if(pwh.equals(wh)|| apple.equals(wh))
	{
		
}else {
	driver.close();
}
	
}

	}
}


