package getWindowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		
		//handle parent window
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		Thread.sleep(2000);
		
		//handle child window
		Set<String> childHandle = driver.getWindowHandles();
		//System.out.println(childHandle);
		
		for(String wh:childHandle)
		{
			System.out.println(wh);
		}
		

	}

}
