package methodsofWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/");
	 Rectangle newsElement = driver.findElement(By.xpath("//h2[text()='News']")).getRect();
		
		int xaxis=newsElement.getX();
		int yaxis=newsElement.getY();
	    int Height=newsElement.getHeight();
	    int  Width=newsElement.getWidth();
	    System.out.println(xaxis+" "+ yaxis+"  "+Height+" "+Width);
	    
	
		
	
		 
	}

}
