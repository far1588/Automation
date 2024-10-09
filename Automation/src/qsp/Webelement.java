package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Webelement {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/DELL/Desktop/demo.html");
driver.findElement(By.tagName("a")).click();
driver.navigate().back();
driver.findElement(By.name("n1")).click();
driver.navigate().back();
driver.findElement(By.className("c1")).click();
driver.navigate().back();
driver.findElement(By.id("d1")).click();
driver.navigate().forward();
driver.navigate().refresh();
String title = driver.getTitle();
System.out.println(title);
//driver.findElement(By.cssSelector("a[id='d1']")).click();
//driver.findElement(By.linkText("google")).click();
driver.quit();
}

}
