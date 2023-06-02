package seleniumTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class pumaStore {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdrive.chrome.driver", "./drivers.chromedriver.exe");
		
		 ChromeOptions co =  new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		                   
		  ChromeDriver  driver  =  new ChromeDriver(co);
		  driver.manage().window().maximize();
		  
		  driver.get("//span[text()='PUMA.com']/ancestor::a/following-sibling::button/descendant::span[text()='Menu']");
		  
		  driver.close();
		  
}
}

