package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class LanchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		//to illegal exception handl 
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");

		//to launch edge browser 
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--remote-allow-origins=*");

		//to launch edgebrowser

		WebDriver driver = new EdgeDriver(eo);            

		//maiximiz the browser 
		driver.manage().window().maximize();

		//to stop the execution 2 sec
	    Thread.sleep(2000);  

		// to close the browser
		driver.close();

	}

}
