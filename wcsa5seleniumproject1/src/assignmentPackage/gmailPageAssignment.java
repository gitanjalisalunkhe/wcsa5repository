package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailPageAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://webmail.au.syrahost.com/");
		driver.findElement(By.id("login")).sendKeys("gitanjalisalunkhe2018@gmail.com");
		driver.findElement(By.id("password")).sendKeys("chhaya@1708");
		driver.findElement(By.className("signIn")).click();


	}

	}


