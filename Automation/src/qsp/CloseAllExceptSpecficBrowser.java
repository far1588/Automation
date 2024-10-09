package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllExceptSpecficBrowser {
	
	public static void main(String[] args) {
		System.out.println("Enter the title of the window");
		Scanner sc=new Scanner(System.in);
		String etitle = sc.nextLine();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("login-google-button")).click();
	 driver.findElement(By.id("apple-signin-button")).click();
		
		String pwh = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();

		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
			String atitle = driver.getTitle();
			if(!(atitle.contains(etitle)))
			{
				driver.close();
	
		}

			
		}


	}
	

}
