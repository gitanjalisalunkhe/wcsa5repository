package qsp;
import org.openqa.selenium.WebDriver;

import java.util.Scanner;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RTM {

	public static void main(String[] args) throws InterruptedException {
		try(Scanner sc=new Scanner(System.in)){
			{
				System.out.print("which browser we want to open");
				String browserValue=sc.next();
				if(browserValue.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
					WebDriver driver=new ChromeDriver();
					driver.manage().window().maximize();
					Thread.sleep(2000);
					driver.close();
				}else if(browserValue.equalsIgnoreCase("Edge")) {
				
				System.setProperty("webdriver.chrome.driver","./Drivers/msedgedriver.exe");
					WebDriver driver=new EdgeDriver();
					driver.manage().window().maximize();
					Thread.sleep(2000);
					driver.close();
				}else if(browserValue.equalsIgnoreCase("Firefox")){
					
					System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
					WebDriver driver=new FirefoxDriver();
					driver.manage().window().maximize();
					Thread.sleep(2000);
					driver.close();
				}else {
					System.out.print("enter valid browser");
				}
			}
		}
					
		
						
						
						
						
						
						
						
						
				
						
				
				
				}
					
					
		}


