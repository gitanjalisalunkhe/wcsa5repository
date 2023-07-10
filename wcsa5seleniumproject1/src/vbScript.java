import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class vbScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://laptop-266esbgv/user/submit_tt.do");
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@class='textField' and @name='pwd']")).sendKeys("manager");
	
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Settings']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		
	}

}
