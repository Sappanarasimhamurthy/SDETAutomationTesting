package checkBoxesAndDropdowns;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demowebshop {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\SAPPA NARASIMHA\\Downloads\\geckodriver-v0.32.2-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(10);
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
		driver.findElement(By.xpath(""));
	}

}
