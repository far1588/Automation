package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxFB {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		
		WebElement monthlistbox = driver.findElement(By.id("month"));
		Select a= new Select(monthlistbox);
		a.selectByValue("12");
		Thread.sleep(3000);
		a.selectByIndex(4);
		Thread.sleep(3000);
		a.selectByVisibleText("Jan");
	}

}