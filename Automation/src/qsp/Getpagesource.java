package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.dom.model.BackendNode;

public class Getpagesource {

	public static void main(String[] args) {
WebDriver driver= new ChromeDriver();
driver.get("https://www.instagram.com/");
String page = driver.getPageSource();
System.out.println(page);
driver.close();

	}

}
