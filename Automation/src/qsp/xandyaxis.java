package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xandyaxis {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
int x = driver.findElement(By.name("login")).getLocation().getX();
int y = driver.findElement(By.name("login")).getLocation().getY();
 System.out.println("the x-axis value is :" +x);
 System.out.println("the y-axis value is :" +y);
 driver.quit();

	}

}
