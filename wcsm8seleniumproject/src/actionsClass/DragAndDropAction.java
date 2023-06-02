package actionsClass;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://demo.guru99.com/test/drag_drop.html");

		WebElement  sc1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement sc2 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));          

		WebElement sc3 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement sc4 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));

		//---------------------------------------------------------------


		WebElement target1 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='bank']"));
		WebElement target2 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='amt7']"));

		WebElement target3 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='loan']"));
		WebElement target4 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='amt8']"));

		Actions act = new Actions (driver);

		act.dragAndDrop(sc1, target1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(sc2, target2).perform();
		Thread.sleep(2000);
		act.dragAndDrop(sc3, target3).perform();
		Thread.sleep(2000);
		act.dragAndDrop(sc4, target4).perform();
	}

}
