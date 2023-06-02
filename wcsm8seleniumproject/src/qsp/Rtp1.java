package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp1 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("selct the browser which u wnat ton open!!");
			String browserValue = sc.next();
			
			if(browserValue.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
				
				driver = new ChromeDriver(co);
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.close();
			}
			else if (browserValue.equalsIgnoreCase("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
				
			    driver = new FirefoxDriver();
				driver.manage().window().maximize();
			    Thread.sleep(2000);
			    driver.close();
			}
			else
			{
				System.out.println("select valid browser value!!!");
				
				
			}
		}
		
	}
}
