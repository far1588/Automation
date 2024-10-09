package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxofactitime {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("http://localhost/login.do");
boolean lab = driver.findElement(By.id("keepLoggedInLabel")).isSelected();
if(lab==true)
	System.out.println("the checkbox is selected");
else
	System.out.println("the checkbox is not selected");
driver.quit();
	}

}
