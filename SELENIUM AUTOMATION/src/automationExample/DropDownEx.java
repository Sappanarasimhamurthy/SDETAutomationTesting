package automationExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEx {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SAPPA NARASIMHA\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
	WebElement India=driver.findElement(By.xpath("//tbody/tr[11]/td[2]"));
	
	Select IndiaE= new Select(India);
	
	IndiaE.selectByValue("6");
	
	
		
		
	
		
	
		
	}

}
