package pratical2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CsslocatorFind {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
			
			driver.get("https://demoqa.com/automation-practice-form");
			
			WebElement firstname = driver.findElement(By.cssSelector("input[id^='fir']"));
	        firstname.sendKeys("Anil");
	        
	        WebElement lastname = driver.findElement(By.cssSelector("input[id^='las']"));
	        	lastname.sendKeys("Rode");
		
	}

}

