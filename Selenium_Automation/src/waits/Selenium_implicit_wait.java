package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_implicit_wait {
	public static void main(String[] args) throws InterruptedException {
		selenium_wait();
	}

	public static void selenium_wait() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Automation\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().getImplicitWaitTimeout();
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("automation step by step");
		driver.findElement(By.xpath("//input[@value='Google Search']")).sendKeys(Keys.ENTER);
		// driver.findElement(By.name("abcd")).sendKeys(Keys.ENTER);;
		driver.close();
		driver.quit();
	}

}
