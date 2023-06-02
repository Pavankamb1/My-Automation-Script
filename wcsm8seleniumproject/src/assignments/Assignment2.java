package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException
	{
		
	
	//to avoid illigalStateException
	       System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			// to avoid connectionFailedException
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			                                       // launch chrome browser
		   WebDriver driver=new ChromeDriver(co);
	                                                //to maximize 
		   driver.manage().window().maximize();
		   //-------------------------------------
		   driver.navigate().to("https://www.facebook.com/login/");
		   Thread.sleep(2000);
		   driver.findElement(By.id("email")).click();
		   
		   //-----------------------
		   driver.navigate().to("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		   Thread.sleep(3000);
		   driver.findElement(By.id("ap_email")).click();
		   
		   //-----------------------------------
		   driver.navigate().to("https://app.fireflink.com/signin");
		   Thread.sleep(2000);
		   driver.findElement(By.id("mui-1")).click();
		   //-----------------------
		   
		   driver.navigate().to("http://app.firecrowd.com/");
		   Thread.sleep(2000);
		   driver.findElement(By.id("email")).click();
		   //---------------------------
		   
		   driver.navigate().to("https://id.atlassian.com/login?continue=https%3A%2F%2Fid.atlassian.com%2Fjoin%2Fuser-access%3Fresource%3Dari%253Acloud%253Ajira%253A%253Asite%252Fd9fa28d2-6f30-4dd8-bee7-2fe71c3be301%26continue%3Dhttps%253A%252F%252Fproduct.atlassian.net%252Fjira%252Fyour-work&application=jira");
		   Thread.sleep(2000);
		   driver.findElement(By.id("username")).click();
		   driver.close();
}
}
