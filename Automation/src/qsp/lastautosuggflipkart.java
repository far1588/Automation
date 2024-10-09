package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lastautosuggflipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.flipkart.com/");
	
		driver.findElement(By.name("q")).sendKeys("iphone 15 promax");
Thread.sleep(3000);
		 List<WebElement> allsugg = driver.findElements(By.xpath("//ul[@class='_1va75j']//li//span"));
		 int count = allsugg.size();
		 System.out.println(count);


		for(int i=0;i<count;i++)
		{
		 String text = allsugg.get(i).getText();
		 System.out.println(text);
		}
		
		
			allsugg.get(count-1).click();
		
			

			}

		
	}


