package checkBoxesAndDropdowns;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthencatedPopUp {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SAPPA NARASIMHA\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();

}}
