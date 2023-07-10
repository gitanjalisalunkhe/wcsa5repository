package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//String cssProperty = driver.findElement(By.xpath("//button[text()=' Login ']")).getCssValue("color");
		//System.out.println(cssProperty);
		
		String cssProperty = driver.findElement(By.xpath("//button[text()=' Login ']")).getCssValue("font");
		System.out.println(cssProperty);
		
	}

	
}
