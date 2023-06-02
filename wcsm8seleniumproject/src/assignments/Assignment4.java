package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Assignment4 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
		 EdgeOptions eo = new EdgeOptions();
		 eo.addArguments("--remote-allow-origins=*");
		 
		 WebDriver driver = new EdgeDriver(eo);
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//button[text()='✕']")).click();
		 
		 driver.findElement(By.name("q")).sendKeys("mobile");
		 
		 
		 driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(""));
		 
	}

}

