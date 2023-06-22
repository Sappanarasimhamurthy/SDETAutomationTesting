package demoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoWebShop {
	
		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SAPPA NARASIMHA\\Music\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();

			// WebElement txtUsername=driver.findElement(By.name("username"));
			// txtUsername.sendKeys("Admin");

			Thread.sleep(20000);

			driver.findElement(By.name("username")).sendKeys("Admin");

			driver.findElement(By.name("password")).sendKeys("admin123");

			driver.findElement(By.tagName("button")).click();

			String Actual_tittle = driver.getTitle();
			String Expected_tittle = "OrangeHRM";

			if (Actual_tittle.equals(Expected_tittle))

			{
				System.out.println("Test Case Passed");
			}

			else {
				System.out.println("Test case Failed");
			}

			driver.close();
		}

	}



