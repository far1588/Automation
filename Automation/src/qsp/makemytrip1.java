package qsp;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemytrip1 {

	public static void main(String[] args) {
		 
		        // Set up the WebDriver
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		       // driver.manage().timeouts().implicitlyWait(Duration);

		        // Navigate to MakeMyTrip
		        driver.get("https://www.makemytrip.com/");
		        
		        // Close the initial popup if it appears
		        try {
		            WebElement closeButton = driver.findElement(By.className("commonModal__close"));
		            closeButton.click();
		        } catch (Exception e) {
		            // Popup might not appear, so continue
		        }
		        
		        // Select departure city
		        driver.findElement(By.id("fromCity")).click();
		        driver.findElement(By.xpath("//p[text()='Bangalore']")).click();

		        // Select arrival city
		        driver.findElement(By.id("toCity")).click();
		        driver.findElement(By.xpath("//p[text()='Goa']")).click();

		        // Select departure date
		        driver.findElement(By.id("departure")).click();
		        driver.findElement(By.xpath("//div[@aria-label='Wed Sep 05 2024']")).click();
		        driver.findElement(By.xpath("//a[text()='Done']")).click(); // Click on 'Done' to apply the date

		        // Click on search button
		        driver.findElement(By.xpath("//a[contains(@class, 'searchButton')]")).click();

		        // Wait for results to load
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		        // Extract flight names and prices
		        List<WebElement> flightNames = driver.findElements(By.xpath("//p[contains(@class, 'boldFont')]"));
		        List<WebElement> flightPrices = driver.findElements(By.xpath("//div[contains(@class, 'priceSection')]//p[contains(@class, 'blackText')]"));

		        // Print flight names and prices
		        System.out.println("Flight Details:");
		        for (int i = 0; i < flightNames.size(); i++) {
		            String flightName = flightNames.get(i).getText();
		            String flightPrice = i < flightPrices.size() ? flightPrices.get(i).getText() : "Price not available";
		            System.out.println("Flight: " + flightName + " - Price: " + flightPrice);
		        }

		        // Close the browser
		        driver.quit();
		    }
		}
	


