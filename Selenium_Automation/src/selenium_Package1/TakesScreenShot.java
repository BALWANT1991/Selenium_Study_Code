package selenium_Package1;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenShot {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Automation\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		String str = d.toString();
		str = str.replace(" ", "_");
		str = str.replace(":", "_");
		System.out.println(str);
		File desc = new File("C:\\Selenium_Automation\\ScreenShot_Images\\Img_" + str + ".jpeg");
		FileHandler.copy(src, desc);
		driver.quit();
		System.out.println("Script run Successfully");

	}

}
