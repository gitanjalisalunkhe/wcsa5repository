package assignment2Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar']")).click();
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456789");
		driver.findElement(By.xpath("//div[text()='Log In' and (@class='css-76zvg2 r-jwli3a r-ubezar r-majxgm')]")).click();
		

	}

}
