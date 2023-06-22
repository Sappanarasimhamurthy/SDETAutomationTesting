package automationExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class GetMethods {
    	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SAPPA NARASIMHA\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		 
		System.out.println("Title of the page:"+driver.getTitle());
		System.out.println("Current URL:"+driver.getCurrentUrl());
		System.out.println("Page source.......");
		System.out.println(driver.getPageSource());
		
			
		                     }

                              }
