package qsp;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpecificOption {

	public static void main(String[] args) {
Scanner s= new Scanner(System.in);
System.out.println("Enter the item");
String item = s.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/DELL/Desktop/hotel.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		
		Select a= new Select(mtrListBox);
		List<WebElement> alloptions = a.getOptions();
		
		
		int count=0;
		 for(int i=0;i<alloptions.size();i++)
		 {
			 String text = alloptions.get(i).getText();
			 //System.out.println(text);
		 
	
	if(item.equalsIgnoreCase(text)|| text.contains(item))
	{
	count++;
	break;
	}
		 }
	
if(count>0)
{
	System.out.println(item+ " is present in the dropdown");
}else {
	System.out.println(item+ " is not present in the dropdown");
}
	}

	}
