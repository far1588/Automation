package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class genderradiobutton {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

Thread.sleep(2000);
int y1 = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
int y2 = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).getLocation().getY();
int y3 = driver.findElement(By.xpath("(//input[@type='radio'])[3]")).getLocation().getY();

if(y1==y2&&y2==y3) {
	System.out.println("all the gender radio button are matching and pass");
System.out.println(y1);
System.out.println(y2);
System.out.println(y3);}
else
{
	System.out.println("all the gender radio button are not matching and fail");

}
driver.quit();
	}

}
