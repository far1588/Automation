package qsp;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeCaptureHeadings {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Enter the title");
		Scanner sc=new Scanner(System.in);
		String etitle = sc.nextLine();
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://online.actitime.com/sselenium");
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.id("loginButton")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[4]")).click();
Thread.sleep(5000);
driver.findElement(By.linkText("About your actiTIME")).click();
Thread.sleep(3000);
driver.findElement(By.linkText("Read Service Agreement")).click();
String pwh = driver.getWindowHandle();
Set<String> allwh = driver.getWindowHandles();

for(String wh:allwh) {
	driver.switchTo().window(wh);
	System.out.println(wh);
}
Thread.sleep(3000);
List<WebElement> alltitle = driver.findElements(By.xpath("//h2"));
//Thread.sleep(3000);
int count = alltitle.size();
//Thread.sleep(3000);
System.out.println(count);
//Thread.sleep(5000);
for(int i=1;i<count;i++) {
	String allheading = alltitle.get(i).getText();
	System.out.println(allheading);
}
Thread.sleep(3000);
for(String wh:allwh)
{
	driver.switchTo().window(pwh);
	
	if(!(wh.equals(pwh))){
		driver.close();
	}
	}
	Thread.sleep(2000);
driver.quit();


	}
	}
