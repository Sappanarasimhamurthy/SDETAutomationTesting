package automationExample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SAPPA NARASIMHA\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		System.out.println("Title of the page:" + driver.getTitle());
		System.out.println("Current URL:" + driver.getCurrentUrl());
		Thread.sleep(2000);

		driver.findElement(By.linkText("OrangeHRM, Inc")).click();

		System.out.println(driver.getWindowHandles());

		Set<String> windows = driver.getWindowHandles();
		for (String winds : windows)

		{
			System.out.println(winds);
		}

	   }
         }