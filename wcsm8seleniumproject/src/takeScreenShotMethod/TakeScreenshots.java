package takeScreenShotMethod;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v110.runtime.model.ConsoleAPICalled.Type;

public record TakeScreenshots() {
	public static void main(String[] args) {
		
		System.setProperty("WedDriver.chrome.driver", "./drivers.chromedriver.exe");
		
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
		  driver.get("https://wwww.google.com");
		  
		  TakesScreenshot ts = (TakesScreenshot)driver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 new File ("./Screenshot");
		  
		  
		  
		  
		
		
	}

}
