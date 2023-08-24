package window_handles;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handles {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Automation\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Thread.sleep(2000);
		Set<String> windows = driver.getWindowHandles(); // [parentid,childid,subchildId]
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		Thread.sleep(2000);
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentId);
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(emailId);
		System.out.println("Succesfully Run");
		driver.quit();

	}

}