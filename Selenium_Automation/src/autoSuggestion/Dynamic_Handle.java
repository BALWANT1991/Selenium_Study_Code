package autoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Handle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Automation\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("samsung");
		Thread.sleep(5000);

		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));

		System.out.println(elements.size());

		for (int i = 0; i <= elements.size() - 1; i++) {
			System.out.println(elements.get(i).getText());
			String str = elements.get(i).getText();
			if (str.equalsIgnoreCase("samsung galaxy")) {
				elements.get(i).click();
				break;
			}
		}
		driver.quit();
	}
}
