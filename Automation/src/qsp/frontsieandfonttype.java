package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frontsieandfonttype {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
String family = driver.findElement(By.xpath("//a[.='Forgotten password?']")).getCssValue("font-family");
String size = driver.findElement(By.xpath("//a[.='Forgotten password?']")).getCssValue("font-size");
	System.out.println(family);
	System.out.println(size);
	driver.quit();
	}

}
