package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActiTime {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");  //illegle state exception 
		
		ChromeOptions co = new ChromeOptions();           // connection fail exception 
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);      // to launch the browser 
		driver.manage().window().maximize();           // miximiz the browser 
		
		driver.get("http://desktop-5c8h91h/login.do");
		
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("admin"); 
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("pwd")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
