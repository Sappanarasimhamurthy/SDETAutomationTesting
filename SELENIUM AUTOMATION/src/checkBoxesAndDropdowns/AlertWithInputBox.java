package checkBoxesAndDropdowns;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertWithInputBox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SAPPA NARASIMHA\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();

		Alert alertWindow = driver.switchTo().alert();

		System.out.println(alertWindow.getText());

		alertWindow.sendKeys("Welcome");

		alertWindow.accept();

		String actual_Text = driver.findElement(By.xpath("//p[@id='result']")).getText();
		String Exp_Text = "You entered: Welcome";

		if (actual_Text.equals(Exp_Text)) {
			System.out.println("Test is Passed");

		} else {
			System.out.println("Test is Failed");
		}

	}

}
