package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mtroptionsreverse {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/DELL/Desktop/hotel.html");
WebElement mtrlistbox = driver.findElement(By.id("mtr"));
Select s=new Select(mtrlistbox);
List<WebElement> alloption = s.getOptions();
int count=alloption.size();
for(int i=count-1;i>=0;i--)
{
String text = alloption.get(i).getText();
System.out.println(text);
}
driver.quit();
}
	
}
