package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		Thread.sleep(2000);
		
		WebElement target = driver.findElement(By.xpath("//a[text()='Coins ']"));
		Actions act1 = new Actions(driver);
		Thread.sleep(2000);
		act1.moveToElement(target).perform();
		
		WebElement target2 = driver.findElement(By.xpath("//span[text()='1 gram' and(@data-p='gold-coins-weight-1gms,m')]"));
		target2.click();
		
		WebElement coin = driver.findElement(By.xpath("//h1[text()='1 gram 24 KT Gold Coin']"));
		//boolean value = display.isDisplayed();
		
		//System.out.println(value);
		//driver.close();
		if(coin.isDisplayed()) {
			Thread.sleep(2000);
			driver.quit();
		}
		else {
			System.out.println("Exeption");
		}
		

	}

}
