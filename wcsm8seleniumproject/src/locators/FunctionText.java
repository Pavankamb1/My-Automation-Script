package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FunctionText {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers.chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://app.fireflink.com/signin?_gl=1*en1vxb*_ga*MTg2OTYwMDY2Mi4xNjc2MzUxNzQx*_ga_"
				+ "XT2HK8QEM5*MTY4MDYxMzA0OS4zLjEuMTY4MDYxMzc2NC42MC4wLjA.&_ga=2.240691203.1869698797.1680613049-"
				+ "1869600662.1676351741");
		
		driver.findElement(By.name("value")).sendKeys("pavankamble0202@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("value")).sendKeys("Password@123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
	}

}
