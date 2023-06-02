package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TagnameLocator {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe"); //illegle state exception handled 
		
		ChromeOptions co = new ChromeOptions();        // connection fail exception 
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);    // to launch the chrome browser 
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/PAVAN/Desktop/@HTML/TestField.html");    // to past the text box url 
		
		Thread.sleep(2000);             // delay for 2 sec
		
		driver.findElement(By.tagName("input")).sendKeys("admin");    // inside the text field enter what y want 
		
		//------------------------------------------------------
		
		driver.navigate().to("https://www.instagram.com/");     // to navigate insta and copy the url 
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("admin");   // to pass the any kind of value 
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("manager");  // find element take the data by defoult in single text field 
	}

}