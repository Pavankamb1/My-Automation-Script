package seleniumTest;

/*import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActiTimeLoginPage {
	
	/*public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdrive.chrome.driver", "./drivers.chromedriver.exe");
		
		 ChromeOptions co =  new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		                   
		  ChromeDriver  driver  =  new ChromeDriver(co);
		
		//driver.manage().window().maximize();
		
		driver.get("http://desktop-5c8h91h/login.do");
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}*/


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActiTimeLoginPage 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("http://desktop-5c8h91h/login.do");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
	}
}