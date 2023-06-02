package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserClose {
	
	public static void main(String[] args)  throws InterruptedException
	{
		// To avaid AvaidIllegalException 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
        // To avoid ConnectionIllegalException
		 ChromeOptions co = new ChromeOptions();
	    	co.addArguments("--remote-allow-origins=*");
	    	
	    // to launchChromeBrowser
	    	ChromeDriver driver= new ChromeDriver(co);
	    	
	    	// to maximize browser 
	    	driver.manage().window().maximize();
	    	
	    	//stop the executio  of script for 2 sec
	    	Thread.sleep(2000);
		
	    	//to close the eade browser 
		
		driver.close();
		
	}

}
