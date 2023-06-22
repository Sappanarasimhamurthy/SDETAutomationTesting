package automationProject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

    public class DemoWebShop {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\SAPPA NARASIMHA\\Downloads\\geckodriver-v0.32.2-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

	}

}
