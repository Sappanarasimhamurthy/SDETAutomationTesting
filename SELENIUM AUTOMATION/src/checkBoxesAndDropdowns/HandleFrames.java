package checkBoxesAndDropdowns;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleFrames {
	
		
		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\SAPPA NARASIMHA\\Downloads\\geckodriver-v0.32.2-win32\\Geckodriver.exe");
			
			WebDriver driver = new FirefoxDriver();

			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
		
		// Capture WindowIDs
		//driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		//java.util.Set<String> windowIDs=driver.getWindowHandles();
		
		
		
		 
		
		
		
	}

}
