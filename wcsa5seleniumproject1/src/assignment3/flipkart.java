package assignment3;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver. get("https://www.flipkart.com/");
       driver.findElement(By.xpath("//button[text()='✕']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hp laptop");
       driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[text()='HP 247 G8 Athlon Dual Core - (8 GB/1 TB HDD/Windows 11 Home) 247 G8 Notebook Notebook']/../..//div[text()='₹23,890']")).click();
	   
	   
      
           
	}
}
