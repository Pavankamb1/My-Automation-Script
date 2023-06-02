package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class scrollUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.instagram.com");
		
		//scrolling opration
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//ScrollDown
		
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,700)");
		
		Thread.sleep(2000);
		jse.executeScript("Window.scrollBy(0,-700)");
		driver.close();
			
	}

}
