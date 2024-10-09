package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintWithOutForLoopCollectionsGetOptions {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/hotel.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		
		Select s= new Select(mtrListBox);
		String text = s.getWrappedElement().getText();
		System.out.println(text);
		driver.quit();		
		
			}

}
