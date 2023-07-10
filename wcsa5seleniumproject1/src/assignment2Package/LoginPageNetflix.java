package assignment2Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageNetflix {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/Login");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='userLoginId']")).sendKeys("qspiders");
		driver.findElement(By.cssSelector("input[id$='word']")).sendKeys("123456");
		driver.findElement(By.cssSelector("button[class$='submit btn-small']")).click();
		

	}

}
