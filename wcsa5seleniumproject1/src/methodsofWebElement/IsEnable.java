package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/accounts/login/");
		//driver.findElement(By.name("username")).sendKeys("its_gitanjali_2000");
		//driver.findElement(By.name("password")).sendKeys("nikita@3010");
		boolean loginButton = driver.findElement(By.xpath("//button[contains(@class,'_acan _acap _acas _aj1-')]")).isEnabled();
		System.out.println(loginButton);
		

	}

}
