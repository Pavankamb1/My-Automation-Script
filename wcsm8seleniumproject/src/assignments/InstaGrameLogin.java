package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InstaGrameLogin {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdrive.chrome.driver", "./drivers.chromedriver.exe");
		
		 ChromeOptions co =  new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		                   
		  ChromeDriver  driver  =  new ChromeDriver(co);
		  
		  driver.get("https://www.instagram.com/accounts/login/");
		  Thread.sleep(2000);
		  driver.findElement(By.tagName("input")).sendKeys("pavan");
		  driver.close();

		  
		  
	}
}
