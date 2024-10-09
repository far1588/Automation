package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAppleIndeedGoogle {

	public static void main(String[] args) throws InterruptedException  {
		System.out.println("Enter the title of apple window");
		Scanner sc=new Scanner(System.in);
		String etitle = sc.nextLine();
		
		System.out.println("Enter the title of the window to close 2nd");
		String gotitle = sc.nextLine();
	
WebDriver driver=new ChromeDriver();
driver.get("https://secure.indeed.com/");
driver.findElement(By.id("login-google-button")).click();


String pwh = driver.getWindowHandle();
Set<String> allwh = driver.getWindowHandles();

for(String wh:allwh) {
	driver.switchTo().window(wh);
	}
WebElement text = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
String gtext = text.getText();
System.out.println(gtext);

for(String wh1:allwh) {
	driver.switchTo().window(pwh);
}

driver.findElement(By.id("apple-signin-button")).click();
Set<String> allwh1 = driver.getWindowHandles();
//System.out.println(allwh1);
for(String wh2:allwh1) {
	driver.switchTo().window(wh2);
	String atitle = driver.getTitle();
	//System.out.println(atitle);
	if(atitle.contains(etitle)) {
		WebElement text1 = driver.findElement(By.id("iforgot-link"));
		String atext = text1.getText();
		System.out.println(atext);
		Thread.sleep(2000);
		driver.close();
	}
}
for(String go:allwh) {
	driver.switchTo().window(go);
	//System.out.println(go);
	String gotitle1 = driver.getTitle();
	//System.out.println(gotitle1);
	if(gotitle1.contains(gotitle))
	{
		driver.close();
	}
}
driver.quit();
	}
	
}
