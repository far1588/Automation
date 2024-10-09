package qsp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPrintYouPressedCancelOrNot {

	public static void main(String[] args) {
	
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demo.automationtesting.in/Alerts.html");

			driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

 driver.switchTo().alert().dismiss();
boolean text = driver.findElement(By.id("demo")).isDisplayed();
	
	if(text==true) {
		System.out.println("you pressed cancel ");
	}
	else {
		System.out.println("you did not press cancel");
	}
	}

}
