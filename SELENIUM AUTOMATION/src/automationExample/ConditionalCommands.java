package automationExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {
	
		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SAPPA NARASIMHA\\Downloads\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.nopcommerce.com/en");
			driver.manage().window().maximize();
			
            WebElement logo=driver.findElement(By.xpath("//img[@title='nopCommerce']"));
            System.out.println("Display Status of logo:"+logo.isDisplayed());
            System.out.println("Enable Status of logo:"+logo.isEnabled());
            
			
		
		}
		
		}
