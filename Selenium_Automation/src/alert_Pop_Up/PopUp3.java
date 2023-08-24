package alert_Pop_Up;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp3 {
	public static void main(String[] args) throws NoAlertPresentException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Automation\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		Thread.sleep(2000);
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids.size());
		Iterator<String> itr = ids.iterator();
		while (itr.hasNext()) {

			String mainwindow = itr.next();
			String childwindow = itr.next();

			System.out.println(mainwindow);
			System.out.println(childwindow);
			driver.switchTo().window(childwindow);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.switchTo().window(mainwindow);
			driver.manage().window().minimize();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			driver.quit();
			
		}
	}
}