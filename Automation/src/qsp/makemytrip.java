package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class makemytrip {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
	    driver.findElement(By.className("commonModal__close")).click();
	    driver.findElement(By.id("fromCity")).click();
	    driver.findElement(By.xpath("(//li[@role='option'])[4]")).click();
	    driver.findElement(By.id("toCity")).click();
	    driver.findElement(By.xpath("(//li[@role='option'])[10]")).click();
	    
	    WebElement departureDateField = driver.findElement(By.xpath("//label[@for='departure']"));
        departureDateField.click();
        
	   //driver.findElement(By.xpath("//label[@for='departure']")).click();
	   Thread.sleep(3000);
	       WebElement date = driver.findElement(By.xpath("//div[@aria-label=\"Thu Sep 05 2024\"]"));
	     date.click();
	}

}
