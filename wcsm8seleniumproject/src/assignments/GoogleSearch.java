package assignments;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
      
	public static void main(String[] args) throws InterruptedException {

		//WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(co);
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("java");
		Thread.sleep(2000);
		
	   	List<WebElement> list = driver.findElements(By.xpath("//div[@id='Alh6id']"));
	   	
	   	for(int i=0; i<list.size();i++)
	   	{
	   		String java = list.get(i).getText();
	   		System.out.println(java);
	   		if(list.get(i).getText().contains("java interview questions"))
	   			
	   		{
	   			Thread.sleep(2000);
	   			list.get(i).click();
	   			Thread.sleep(2000);
	   		}
	   		                                                                                                                                                                                                                                                                                                                                                                           
	   	}

	}

}