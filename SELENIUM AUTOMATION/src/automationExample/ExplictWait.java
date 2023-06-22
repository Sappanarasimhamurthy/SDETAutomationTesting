package automationExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWait {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SAPPA NARASIMHA\\Downloads\\chromedriver_win32\\chromedriver.exe");

			
			WebDriver driver = new ChromeDriver();
WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			
	           
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	}

}
