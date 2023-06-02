package takeScreenShotMethod;

import java.io.File;
//import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

//import com.google.common.io.Files;

public class GetScreenShotMethod {
	
	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("Webdriver.chrome.driver", "./drivers.chromedriver.exe");
		
	     WebDriver driver = new ChromeDriver();
	     
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    driver.get("https://www.google.com");
	    
		/*TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/ss1.jpg");
		
		Files.copy(src, dest);*/
	    
	    TakesScreenshot ts = (TakesScreenshot)driver;
	    
	     File src = ts.getScreenshotAs(OutputType.FILE);
	     File dest = new File("./screenshots/ss1.jpg");
	   
	     Files.copy(src,dest);
	   
	}

}
