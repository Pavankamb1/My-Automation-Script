package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	static WebDriver driver;
  @BeforeTest
  public void property()
  {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
  }
  
  @BeforeMethod
  public void setUp()
  {
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("http://desktop-5c8h91h/login.do");
	  
  }
  
  @DataProvider(name="ActiTimeData")
  public Object dataprovider()
  {
	  Object[][] dataprovider = new Object [5] [2];
	  
	  dataprovider[0][0]="admin";
	  dataprovider[0][1]="manager";
	  return dataprovider;
  }
  
  @AfterMethod
  public void tearDown()
  {
	  driver.quit();
  }
  
	@Test(dataProvider = "ActiTimeData")
  public void login(String usn,String pwd) {
		
		driver.findElement(By.name("username")).sendKeys(usn);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton"));
	  
  }
}
