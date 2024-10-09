package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class submit {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new FirefoxDriver();
driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
driver.findElement(By.xpath("//button[@type='submit']")).submit();
Thread.sleep(3000);
driver.quit();
}

}
