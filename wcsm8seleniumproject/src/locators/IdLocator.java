package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IdLocator {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");  //illegle state exception 
		
		ChromeOptions co = new ChromeOptions();           // connection fail exception 
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);      // to launch the browser 
		driver.manage().window().maximize();           // miximiz the browser 
		
		driver.get("file:///C:/Users/PAVAN/Desktop/@HTML/DropDown.html");
		
		Thread.sleep(2000);
		driver.findElement(By.id("i1")).click();
	}

}