package automationExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitStatements {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SAPPA NARASIMHA\\Downloads\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			
	          Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
			

}
}