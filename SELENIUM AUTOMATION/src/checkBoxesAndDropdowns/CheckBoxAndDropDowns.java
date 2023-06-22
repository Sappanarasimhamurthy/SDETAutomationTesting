package checkBoxesAndDropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAndDropDowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SAPPA NARASIMHA\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='female']")).click();

		// driver.findElement(By.xpath("//input[@id='monday']")).click();

		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("Total number of checkboxes:" + checkboxes.size());

		// for (int i = 0; i < checkboxes.size(); i++)
		
		for (int i = 4; i < checkboxes.size(); i++) {
			checkboxes.get(i).click();
		}
	}

}
