package qsp;

import java.time.Duration;

import org.bouncycastle.util.Selector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectdemoapps {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
WebElement mtrlistbox = driver.findElement(By.id("select-multiple-native"));
Select s=new Select(mtrlistbox);
//Thread.sleep(3000);
s.selectByIndex(0);
s.selectByValue("Poland");
s.selectByVisibleText("Germany");
	}

}
