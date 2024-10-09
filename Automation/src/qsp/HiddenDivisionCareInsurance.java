package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisionCareInsurance{

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		
		WebElement month = driver.findElement(By.xpath("//select[contains(@class,'month')]"));
		month.click();
		Select a=new Select(month);
		a.selectByValue("4");
		
		WebElement year = driver.findElement(By.xpath("//select[contains(@class,'year')]"));
		year.click();
		Select b=new Select(year);
		b.selectByValue("2013");
		
		driver.findElement(By.xpath("//a[@data-date=\'5\']")).click();
		
		driver.findElement(By.id("alternative_number")).sendKeys("987654321");
		
		driver.findElement(By.id("renew_policy_submit")).click();
		
		boolean PolicyId = driver.findElement(By.id("policynumberError")).isDisplayed();
		
		if(PolicyId==true)
		{
			System.out.println("text is displayed");
		}
		else
		{
			System.out.println("text is not displayed");
		}
		
	}

}
