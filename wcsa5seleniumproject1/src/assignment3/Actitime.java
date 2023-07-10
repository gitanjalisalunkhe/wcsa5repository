package assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://laptop-266esbgv/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='textField' and @name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\"/tasks/otasklist.do\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Projects &')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='button' and @value='Create New Customer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("phonepay");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='customers[9]']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Delete Selected']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Delete This Customer']")).click();
		driver.close();
		

	}

}
