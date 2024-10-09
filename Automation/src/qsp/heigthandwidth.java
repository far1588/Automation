package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class heigthandwidth {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("http://localhost/login.do");
int x = driver.findElement(By.id("username")).getSize().getHeight();
int y = driver.findElement(By.id("username")).getSize().getWidth();

int x2 = driver.findElement(By.name("pwd")).getSize().getHeight();
int y2 = driver.findElement(By.name("pwd")).getSize().getWidth();

if(x==x2 && y==y2)
System.out.println("the height and width of both user and password is equal and pass");
	
else
	System.out.println("the height and width of both user and password is not equal and fail");
	driver.quit();
	}
}
