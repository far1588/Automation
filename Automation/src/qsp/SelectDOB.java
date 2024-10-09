package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDOB {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		WebElement daylistbox = driver.findElement(By.id("day"));
		Select a= new Select(daylistbox);
		a.selectByIndex(27);
		WebElement monthlistbox = driver.findElement(By.id("month"));
		Select b= new Select(monthlistbox);
		b.selectByValue("12");
		WebElement yearlistbox = driver.findElement(By.id("year"));
		Select c= new Select(yearlistbox);
		c.selectByVisibleText("2013");
	}

}
