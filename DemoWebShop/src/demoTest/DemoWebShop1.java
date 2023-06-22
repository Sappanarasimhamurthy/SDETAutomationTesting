 package demoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class DemoWebShop1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SAPPA NARASIMHA\\Music\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("narasimha.Tosca@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Murthy7585@");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		
		System.out.println("User Login Sucessfully");
		
		driver.close(); 
		
	            } 

                }
                   
