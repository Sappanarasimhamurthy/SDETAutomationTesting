package demoTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaTpoint {
	
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
        		          "C:\\Users\\SAPPA NARASIMHA\\Music\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.javatpoint.com/");
			
			
			driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();

			driver.findElement(By.xpath("//div[@class='ddsmoothmenu']//ul//li//a[@href='python-tutorial'][normalize-space()='Python']")).click();
            driver.findElement(By.cssSelector("div[id='bottomnext'] a[class='next']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//div[@id='bottomnextup']//a[@class='next'][contains(text(),'← prev')]")).click();

                        }}
