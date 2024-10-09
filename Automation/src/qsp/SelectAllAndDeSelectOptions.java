package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllAndDeSelectOptions {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/DELL/Desktop/hotel.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		
		Select a= new Select(mtrListBox);
		List<WebElement> alloptions = a.getOptions();
		
		int count = alloptions.size();
		 for(int i=0;i<alloptions.size();i++)
		 {
			 a.selectByIndex(i);
	}

		 for(int i=count-1;i>=0;i--) {
			 a.deselectByIndex(i);
		 }
}
}