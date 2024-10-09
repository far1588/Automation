package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphonemobile14 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
	   WebElement a = driver.findElement(By.name("q"));
	   a.sendKeys("iphone 14 pro max");
	   a.submit();
		
		List<WebElement> allnames = driver.findElements(By.className("KzDlHZ"));
		List<WebElement> allprices = driver.findElements(By.xpath("//div[contains(@class,'_4b5DiR')]"));
	     int count = allnames.size();
	     int count1 = allprices.size();
	     if(count==count1) {
	     System.out.println("total products found:"+count);
	     System.out.println("  ");
	     
	for(int i=0; i<count;i++) {
		String productname = allnames.get(i).getText();
		String productprice = allprices.get(i).getText();
		System.out.println("product:"+productname);
		System.out.println("price:"+productprice);
		System.out.println("_______________________");
	}}
	else {
		System.out.println("mismatch between the numbers of product name and product price");
	}driver.close();
	}
}
