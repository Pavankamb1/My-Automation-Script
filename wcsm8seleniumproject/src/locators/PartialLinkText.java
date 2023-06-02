package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class PartialLinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");

		//FirefoxOptions co = new FirefoxOptions();
		//co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/PAVAN/Desktop/@HTML/linkWEB.html");
		
		driver.findElement(By.partialLinkText("FlipkartLink")).click();

	}

}