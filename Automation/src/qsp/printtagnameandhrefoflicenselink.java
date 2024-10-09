package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printtagnameandhrefoflicenselink {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		WebElement license = driver.findElement(By.id("licenseLink"));
		String tug = license.getTagName();
		String tug1 = license.getAttribute("href");
		System.out.println("tag name of actiTIME is :" +tug);
		System.out.println("href of actiTIME is:" +tug1);
		
		driver.quit();
		
	}
	

}
