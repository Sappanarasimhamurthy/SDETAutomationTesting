package automationExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetWindow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SAPPA NARASIMHA\\Downloads\\chromedriver_win32\\chromedriver.exe");

		
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-orgins=*");
			WebDriver driver = new ChromeDriver(options);

			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			 
			System.out.println("Title of the page:"+driver.getTitle());
			System.out.println("Current URL:"+driver.getCurrentUrl());
            System.out.println(driver.getWindowHandle());
	}

}
