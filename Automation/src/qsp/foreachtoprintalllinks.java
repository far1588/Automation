package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class foreachtoprintalllinks {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
int count = allLinks.size();
System.out.println(count);
for(WebElement Link: allLinks)
{
String text = Link.getText();
System.out.println(text);
}

driver.quit();
	}

}
