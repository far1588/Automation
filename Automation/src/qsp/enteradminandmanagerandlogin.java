package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class enteradminandmanagerandlogin {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new FirefoxDriver();
driver.get("https://online.actitime.com/sselenium");
Thread.sleep(1000);
driver.findElement(By.id("username")).sendKeys("admin");
Thread.sleep(1000);
driver.findElement(By.name("pwd")).sendKeys("manager");
Thread.sleep(1000);
driver.findElement(By.xpath("//div[text()='Login ']")).click();
Thread.sleep(5000);
driver.quit();


	}

}
