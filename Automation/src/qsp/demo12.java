package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo12 {

	public static void main(String[] args) throws Exception {
WebDriver driver= new ChromeDriver();
Thread.sleep(2000);
driver.get("https://www.instagram.com/");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.get("https://chatgpt.com/");
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.get("https://www.youtube.com/");
Thread.sleep(2000);
driver.quit();
	}

}
