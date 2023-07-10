package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapchatAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.snapchat.com/accounts/v2/login");
		driver.findElement(By.id("form-group")).sendKeys("gitanjalisalunkhe2018@gmail.com");
		
		driver.findElement(By.className("class=\"btn btn-lg btn-default\"")).click();


	}

}
