package robotActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyPressExample2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		Thread.sleep(2000);
		
		WebElement target = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		Actions act = new Actions(driver);
		act.moveToElement(target);
		
		driver.findElement(By.xpath("//a[text()='Band']")).click();
		Thread.sleep(2000);
		
		//click and hold
		WebElement target2 = driver.findElement(By.xpath("//div[text()='Filter by']"));
		for(int i=0;i<=2;i++) {
		act.doubleClick(target2).perform();
		act.clickAndHold(target2).perform();
		}
	
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		
		//identify search box
		driver.findElement(By.name("search_query")).click();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//paste
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		//hit enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//driver.findElement(By.xpath("//span[text()='1 Designs']")).isDisplayed();
		//if(driver.findElement(By.xpath("//span[text()='1 Designs']")).isDisplayed()) {
			
		//}
		
		
		
	}
}


