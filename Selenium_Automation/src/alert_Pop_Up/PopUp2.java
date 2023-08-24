package alert_Pop_Up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp2 {
	public static void main(String[] args) throws NoAlertPresentException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Automation\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Alert Message handling
		driver.get("https://demo.guru99.com/Agile_Project/Agi_V1/index.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("devraj07@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("1233455");
		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();

		// Switching to Alert
		Alert alert = driver.switchTo().alert();
		// Accepting alert

		Thread.sleep(2000);
		// Capturing alert message.
		String alertMessage = driver.switchTo().alert().getText();

		// Displaying alert message
		System.out.println(alertMessage);

		alert.accept();
		driver.quit();

	}

}