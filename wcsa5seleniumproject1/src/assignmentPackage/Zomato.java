package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/ncr/golf-course-order-online");
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.tagName("input")).sendKeys("Gita Salunkhe");
		driver.findElement(By.className("sc-1yzxt5f-9 bbrwhB")).sendKeys("gygmnbjguyg");
		driver.findElement(By.className("sc-1o2pknd-1 iPRmnw")).click();
		driver.findElement(By.className("sc-hrBRpH gzaiZu")).click();
		
		



	}

}
