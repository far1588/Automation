package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingRighClick {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");

		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();

		driver.findElement(By.xpath("//section[text()='Button']")).click();
		
		driver.findElement(By.linkText("Right Click")).click();
		
		
		WebElement rightclick = driver.findElement(By.xpath("(//button[text()='Right Click'])[1]"));

		Actions a = new Actions(driver);
		a.contextClick(rightclick).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		
		boolean text = driver.findElement(By.xpath("//span[contains(text(),'You selected')]")).isDisplayed();
		
if(text==true)
{
	System.out.println("text is displayed and pass");
}
else {
	System.out.println("test is not displayed and fail");
}
	}

}
