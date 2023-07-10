package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("input[name*='email']")).sendKeys("gitanjali@123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("input[id*='pass']")).sendKeys("134");
	
		
	} 

	}
