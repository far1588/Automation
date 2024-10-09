package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	    driver.findElement(By.xpath("//section[text()='Check Box']")).click();
	   List<WebElement> checkboxes= driver.findElements(By.name("Domain"));
                 for(int i=0;i< checkboxes.size();i++)
                 {
                	 WebElement checkbox = checkboxes.get(i);
               
                	 if(!checkbox.isSelected())
                	 {
                		 checkbox.click();
                	 }
                 }
                 System.out.println("total checkboxes selected: " +checkboxes.size());
	driver.quit();
	}
}

