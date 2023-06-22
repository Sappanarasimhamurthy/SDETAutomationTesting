package automationExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SAPPA NARASIMHA\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		System.out.println(driver.getCurrentUrl());
		driver.get("https://www.myntra.com/");
		System.out.println(driver.getCurrentUrl());

		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());

		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());

		driver.navigate().refresh();

		{

		}
	}

}
