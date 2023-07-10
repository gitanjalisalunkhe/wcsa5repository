package dropdawn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDropdawn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/WCSA5/web%20Element/Multiselect.html");
		 
		WebElement multiselectDD = driver.findElement(By.id("menu"));
		
       Select sel = new Select(multiselectDD);
		sel.selectByIndex(2);

	}
	

}
