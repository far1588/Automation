package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframs {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");

		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		
		
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		
		
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		
		driver.findElement(By.linkText("Nested iframe")).click();
		
		Thread.sleep(4000);
		
		  WebElement email = driver.findElement(By.xpath("//p[text()='Admin@gmail.com']"));
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.doubleClick(email).perform();
		Thread.sleep(2000);
		/*email.sendKeys(Keys.CONTROL+"C");
		Thread.sleep(2000);
		WebElement email1 = driver.findElement(By.id("email"));
		Thread.sleep(2000);
		a.click(email1);	Thread.sleep(2000);
		email1.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		
	/*	WebElement pwd = driver.findElement(By.xpath("(//p[contains(text(),'Admin')])[2]"));
		Thread.sleep(2000);
		a.doubleClick(pwd).perform();
		email.sendKeys(Keys.CONTROL+"C");
		Thread.sleep(2000);
		WebElement pwd1 = driver.findElement(By.id("password"));
		Thread.sleep(2000);
		a.click(email1);
		Thread.sleep(2000);
		pwd1.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		
		WebElement cpwd = driver.findElement(By.xpath("(//p[contains(text(),'Admin')])[3]"));
		Thread.sleep(2000);
		a.doubleClick(cpwd).perform();
		Thread.sleep(2000);
		email.sendKeys(Keys.CONTROL+"C");
		Thread.sleep(2000);
		WebElement cpwd1 = driver.findElement(By.id("confirm-password"));
		Thread.sleep(2000);
		a.click(email1);
		cpwd1.sendKeys(Keys.CONTROL+"v");
		*/
		
		
	}

}
