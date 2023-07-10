package qsp;

import org.openqa.selenium.edge.EdgeDriver;

public class TolaunchEdgeBrowser {

	public static void main(String[]args ) {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
	    
	    

	}

}
