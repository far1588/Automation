package qsp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingActiveElement {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		 driver.switchTo().activeElement().sendKeys("java");
		
		
		
		driver.quit();
		
		
		
		
		
	}

}
