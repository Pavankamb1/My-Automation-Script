package keyWordDrivenPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements IAutoConstant {
static WebDriver driver;

public void openBrowser() throws IOException
{
	Flib flib = new Flib();
	String browserValue = flib.readPropertyData("./data/config.properties", "browser");
	
	String url = flib.readPropertyData("./data/config.properties", "url");
	
	if(flib.readPropertyData("./data/config.properties", "browser").equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
	}
	else if(browserValue.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
	}
	if(browserValue.equalsIgnoreCase("edge"))
	{
		System.setProperty("webdriver.edge.driver", "./drivers/edgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
	}
	else
	{
		System.out.println("Invalid browser");
	}
}

public void closeBrowser() {
	driver.quit();
}
}
