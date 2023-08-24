package selenium_Package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Automation\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805031%7Ce%7Cfcabook%7C&placement=&creative=550525805031&keyword=fcabook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221112%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-325251762436%26loc_physical_ms%3D9062096%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw7vuUBhBUEiwAEdu2pKBFreldHOwBlVWz_f9-K6uEfhLX5lhf1b1kHEXX4_mOmsa7bcIruBoCjQQQAvD_BwE");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.navigate().to("https://workspace.google.com/resources/video-conferencing/");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.manage().window().minimize();
		System.out.println("Browser Launch successfully");
		driver.close();
		driver.quit();
	}
}
