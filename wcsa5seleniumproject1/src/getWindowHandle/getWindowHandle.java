package getWindowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.manage().window().maximize();
	    //get the handle parent window
	    String parenthandle = driver.getWindowHandle();
	    //System.out.println("Address of parent window:"+parenthandle);
	    Thread.sleep(2000);
     	//launch the childwindow
     	driver.findElement(By.partialLinkText("Open a popup window"));
    	Thread.sleep(2000);
        Set<String> allHandle = driver.getWindowHandles();
        System.out.println("address of child window:"+allHandle);
        
        for(String wh: allHandle) {
        	System.out.print(wh);
        }
       // System.out.println("Address of child window:"+allHandle);


	}

}
