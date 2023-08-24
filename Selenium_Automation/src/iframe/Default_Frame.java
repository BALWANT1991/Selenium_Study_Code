package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Default_Frame {
     public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Automation\\Chrome_Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();	
     driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
     Thread.sleep(5000);
     driver.manage().window().maximize();
     
     driver.switchTo().frame("packageListFrame");
     driver.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click();
     driver.switchTo().defaultContent();
     
     Thread.sleep(5000);
     driver.switchTo().frame("packageFrame");
     driver.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[14]/a/span")).click();
     driver.switchTo().defaultContent();
     
     Thread.sleep(5000);
     driver.switchTo().frame("classFrame");
     driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[2]/a")).click();
     driver.quit();
	
	}

}
