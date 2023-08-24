package alert_Pop_Up;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Automation\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);	
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@id='disha-banner-close']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='nlpCubeBox200X200']/div/div[1]/span[1]/img")).click();
		Thread.sleep(1000);	      
       Alert alt = driver.switchTo().alert();
	  String altsms = driver.switchTo().alert().getText();
		System.out.println(altsms);
		alt.accept();
	}
}
