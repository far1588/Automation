package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
boolean ton = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
if(ton==true)
{
	System.out.println("the facebook button is enabled");
}
	else
	{
		System.out.println("the facebook button is not enabled");
}
driver.quit();
}

	
	}

