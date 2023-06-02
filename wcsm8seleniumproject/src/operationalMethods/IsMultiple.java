package operationalMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsMultiple {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		        WebDriver  driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		        
		        driver.get("file:///C:/Users/PAVAN/Desktop/@HTML/DropDown.html");
		        
		                    WebElement options = driver.findElement(By.name("menu"));
		                    
		                    driver.close();
		                 	
	}

}
