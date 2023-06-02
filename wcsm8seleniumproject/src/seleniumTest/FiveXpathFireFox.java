package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FiveXpathFireFox {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.firefox.driver", "./drivers.geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input@[class=\"fake-editable\"]"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input@[class=\"fake-editable\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("")).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		driver.close();

		
	}

}
