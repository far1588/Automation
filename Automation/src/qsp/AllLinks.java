package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("www.amazon.com");
WebElement alllinks = driver.findElement(By.xpath("//a"));
Object count = alllinks.size();
	}

}
