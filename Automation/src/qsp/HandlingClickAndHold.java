package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingClickAndHold {

	public static void main(String[] args)  {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://demoapps.qspiders.com/");

driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();

driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();

driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();

WebElement circle = driver.findElement(By.id("circle"));

Actions a=new Actions(driver);

a.clickAndHold(circle).perform();

	}

}
