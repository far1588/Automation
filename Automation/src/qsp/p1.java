package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.navigate().back();
		driver.get("https://www.instagram.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
