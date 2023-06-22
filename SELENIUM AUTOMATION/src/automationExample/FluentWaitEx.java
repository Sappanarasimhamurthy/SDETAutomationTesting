package automationExample;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import graphql.com.google.common.base.Function;

public class FluentWaitEx {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SAPPA NARASIMHA\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		FluentWait mywait = new FluentWait(driver);
		mywait.withTimeout(Duration.ofSeconds(50));
		mywait.pollingEvery(Duration.ofSeconds(5));
		mywait.ignoring(NoSuchElementException.class);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		WebElement username = (WebElement) mywait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));

		username.sendKeys("Admin");

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

	}
}
