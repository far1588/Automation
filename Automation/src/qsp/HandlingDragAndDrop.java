package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDragAndDrop {

	public static void main(String[] args)  {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");

		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();

		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();

		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		
		driver.findElement(By.linkText("Drag Position")).click();

		WebElement src1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));

		WebElement src2 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		
		WebElement src3 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		
		WebElement src4 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
		WebElement dest1 = driver.findElement(By.xpath("(//div[contains(@class,'drop-column')])[1]"));

		WebElement dest2 = driver.findElement(By.xpath("(//div[contains(@class,'drop-column')])[2]"));
		
		
		Actions a= new Actions(driver);
		a.dragAndDrop(src1, dest1).dragAndDrop(src2, dest1).perform();
		
		a.dragAndDrop(src3, dest2).dragAndDrop(src4, dest2).perform();
		
		 
		driver.quit();
	}

}
