package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathLocator {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdrive.chrome.driver", "./drivers.chromedriver.exe");
		
		 ChromeOptions co =  new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		                   
		  ChromeDriver  driver  =  new ChromeDriver(co);
		  
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("// input[@placeholder='Password']")).sendKeys("admin");
		  driver.close();

	   
	                        
	}

}
