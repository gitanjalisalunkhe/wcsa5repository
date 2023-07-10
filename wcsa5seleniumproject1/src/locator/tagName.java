package locator;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {

	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("www.instagram.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("qsp");
		}

}