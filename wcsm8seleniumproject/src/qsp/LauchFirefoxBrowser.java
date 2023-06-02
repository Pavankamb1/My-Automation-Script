package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// import org.openqa.selenium.firefox.FirefoxOptions;

public class LauchFirefoxBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");  // illegle state exception
		
		/*FirefoxOptions eo = new FirefoxOptions();
		eo.addArguments("--remote-allow-origins=*");*/

		WebDriver driver = new FirefoxDriver(); // to call the web browser 
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}