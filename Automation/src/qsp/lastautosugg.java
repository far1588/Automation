package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lastautosugg {

	public static void main(String[] args)  {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
driver.get("https://www.google.com/");
driver.findElement(By.name("q")).sendKeys("selenium");

 List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
 int count = allsugg.size();
 System.out.println(count);


for(int i=0;i<count;i++)
{
 String text = allsugg.get(i).getText();
 System.out.println(text);
}
if(count>0)
{
	allsugg.get(count-1).click();
}
	//

	}

}
