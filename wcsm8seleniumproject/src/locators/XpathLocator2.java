package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

class XpathLocator2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.firefox.drver", "drivers.geckodriver.exe");
		
		FirefoxOptions co = new FirefoxOptions();             
		co.addArguments("--remote-allow-origins=*");
		
		FirefoxDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("pavan");
	
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[4]")).click();
			
	}
}