package qsp;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MtrlistboxAlphaorder {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
	
		List<WebElement> alloption = s.getOptions();
		int count = alloption.size();
		TreeSet<String> t=new TreeSet<>();
		for(int i=0;i<count;i++)
		{
		String text = alloption.get(i).getText();
		t.add(text);
		}
		for(String option:t) {
			System.out.println(option);
		//driver.quit();
		}
			
		}

	}


