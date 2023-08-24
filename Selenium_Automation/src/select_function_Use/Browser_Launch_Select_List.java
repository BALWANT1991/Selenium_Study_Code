package select_function_Use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Browser_Launch_Select_List {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Automation\\Chrome_Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805031%7Ce%7Cfcabook%7C&placement=&creative=550525805031&keyword=fcabook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221112%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-325251762436%26loc_physical_ms%3D9062096%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw7vuUBhBUEiwAEdu2pKBFreldHOwBlVWz_f9-K6uEfhLX5lhf1b1kHEXX4_mOmsa7bcIruBoCjQQQAvD_BwE");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Royal");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rajpoot");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("royal07@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("royal07@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password_step_input\"]")).sendKeys("sjajaajsa");
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s = new Select(day);
		s.selectByIndex(0);
		Thread.sleep(2000);

		// by using variable n object to find out proper date ,month n year
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s1 = new Select(month);
		s1.selectByIndex(6); 

		Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s2 = new Select(year);
		s2.selectByValue("1992");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(2000);
		boolean sdt = driver.findElement(By.xpath("//input[@value='2']")).isSelected();
		System.out.println(sdt);
		System.out.println("Successfully Launched");
		driver.quit();
	}
}
