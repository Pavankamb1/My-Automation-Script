package seleniumTest;

/*import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HotStarLogin {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdrive.chrome.driver", "./drivers.chromedriver.exe");

		 ChromeOptions co =  new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");

		  ChromeDriver  driver  =  new ChromeDriver(co);
		  driver.manage().window().maximize();
		  Thread.sleep(2000);

		  driver.get("https://www.hotstar.com");
		 // driver.findElement(by.)

	}

}*/


import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HotStarLogin {
	public static void main(String[] args) throws InterruptedException {


		Scanner sc =new Scanner(System.in);


		System.out.println("Enter your Moblie Number");
		String s1=sc.next();


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");


		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");


		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();


		driver.get("https://www.hotstar.com/in/subscribe/sign-in?returnURL=/in/subscribe/my-account");

		Thread.sleep(2000);

		driver.findElement(By.id("phoneNo")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("phoneNo")).sendKeys(s1);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
	}
}
