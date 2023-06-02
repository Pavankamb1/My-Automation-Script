package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class flipkartStore {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdrive.chrome.driver", "./drivers.chromedriver.exe");
		
		 ChromeOptions co =  new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		                   
		  ChromeDriver driver = new ChromeDriver(co);
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.flipkart.com/");
		  
		  driver.findElement(By.xpath("//button[text()='✕']")).click();
		  Thread.sleep(10000);
		  driver.findElement(By.name("q")).sendKeys("hp laptop");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[text()='Core i7']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[text()='Brand']")).click();
		  driver.close();
	}

	
	
}
