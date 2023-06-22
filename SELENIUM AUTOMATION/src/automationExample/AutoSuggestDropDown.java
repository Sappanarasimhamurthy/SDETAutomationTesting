package automationExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SAPPA NARASIMHA\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");

		List<WebElement> list = driver.findElements(By.xpath("//div[contains@class,'wM6W7d')]//span"));

		System.out.println("Number of suggestions:"+list.size());
		
		for(int i=0;i<list.size();i++)
{System.out.println(list.get(i).getText());

	}
}}