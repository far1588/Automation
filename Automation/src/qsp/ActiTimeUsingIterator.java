package qsp;

import java.time.Duration;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeUsingIterator {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
Thread.sleep(3000);
driver.get("https://online.actitime.com/sselenium");
Thread.sleep(5000);
driver.findElement(By.linkText("actiTIME Inc.")).click();
Thread.sleep(5000);
String pwh = driver.getWindowHandle();
Set<String> allwh = driver.getWindowHandles();

for(String wh:allwh) {
	driver.switchTo().window(wh);
	//System.out.println(wh);
}
ArrayList a= new ArrayList(allwh);
//System.out.println(a);

ListIterator<String> i=a.listIterator();
while(i.hasNext()) {
	String s = i.next();


	if(s.equalsIgnoreCase(pwh)) {
		Thread.sleep(5000);
		driver.close();
}
else {
	driver.switchTo().window(pwh);
	Thread.sleep(5000);
	driver.quit();
}
}

	}
}
	


