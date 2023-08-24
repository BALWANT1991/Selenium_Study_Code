package actions_Perform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Automation\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//Launch the Application Under Test (AUT)
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();

// Right click the button to launch right click menu options
		Actions action = new Actions(driver);

		WebElement link = driver.findElement(By.cssSelector(".context-menu-one"));
		action.contextClick(link).perform();

// Click on Edit link on the displayed menu options
		WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		element.click();

// Accept the alert displayed
		driver.switchTo().alert().accept();
// Closing the driver instance
		driver.quit();

	}
}