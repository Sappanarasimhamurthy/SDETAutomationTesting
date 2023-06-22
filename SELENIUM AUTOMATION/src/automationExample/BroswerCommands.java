package automationExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BroswerCommands {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\SAPPA NARASIMHA\\Downloads\\geckodriver-v0.32.2-win-aarch64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.nopcommerce.com/en");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		 driver.findElements(By.linkText("Get started"));
		driver.close();

        
	           
	               }

                   }
