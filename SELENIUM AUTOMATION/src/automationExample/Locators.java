package automationExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\SAPPA NARASIMHA\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
driver.get("https://demowebshop.tricentis.com/");
driver.manage().window().maximize();

driver.findElement(By.id("small-searchterms")).sendKeys("Simple Computer");

driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();

driver.findElement(By.linkText("Simple Computer")).click();
driver.findElement(By.partialLinkText("Computer")).click();

	
	}


}
