package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {
   
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Automation\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();			
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='react-responsive-modal-closeButton']")).click();
		driver.switchTo().frame("courses-iframe");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[text()='Velocity Foundation'])[1]")).click();
		driver.quit();
		
	}

	
	
}
