package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirIndiaLogin {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdrive.chrome.driver", "./drivers.chromedriver.exe");
		
		 ChromeOptions co =  new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		                   
		  ChromeDriver  driver  =  new ChromeDriver(co);
		  
		  driver.get("https://www.airindia.in/");
		  Thread.sleep(2000);
		  driver.get("https://aiflyingreturns.b2clogin.com/aiflyingreturns.onmicrosoft.com/oauth2/v2.0/authorize?client_id=ac5c8be3-c829-4db6-8eb7-aa4a37c61cbc&redirect_uri=https://api-loyalty.airindia.in/v1/security/authorization/openidconnect/authorize/delegated-token&response_type=code&state=RWFFeEFFeFlSNkNyfmRKczZ-a0xYWENvSEMudllXUERPeTc2aDFXTklCeXY2_en-GB_false_&nonce=RWFFeEFFeFlSNkNyfmRKczZ-a0xYWENvSEMudllXUERPeTc2aDFXTklCeXY2&scope=openid%20offline_access%20profile%20phone%20email&p=B2C_1A_SIGNUP_SIGNIN&prompt=login&display=page&code_challenge_method=S256&code_challenge=7AJKVOvInf_qYSHGzR7DKzmoRXXcC_5SWZTlfFu4hAU&ui_locales=en-GB");
		  Thread.sleep(2000);
		  driver.findElement(By.id("signInName")).sendKeys("pavan");
		  //driver.findElement(By.tagName("alt")).sendKeys("Login icon");
		  driver.close();

		  
		  
	}
}

