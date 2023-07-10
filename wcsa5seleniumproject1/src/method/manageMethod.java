package method;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class manageMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
                     WebDriver driver   = new ChromeDriver();
                      Dimension d =  new Dimension(600,400);
                       driver.manage().window().setSize(d);
                         
	}

}
