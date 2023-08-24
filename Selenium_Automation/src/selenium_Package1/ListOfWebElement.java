package selenium_Package1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfWebElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Automation\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805031%7Ce%7Cfcabook%7C&placement=&creative=550525805031&keyword=fcabook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221112%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-325251762436%26loc_physical_ms%3D9062096%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw7vuUBhBUEiwAEdu2pKBFreldHOwBlVWz_f9-K6uEfhLX5lhf1b1kHEXX4_mOmsa7bcIruBoCjQQQAvD_BwE");

		Thread.sleep(500);
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		System.out.println(link.size());

		for (int i = 0; i <= link.size() - 1; i++) {
			System.out.println(link.get(i).getText());
		}
		Thread.sleep(1000);
		List<WebElement> img = driver.findElements(By.xpath("//img"));
		System.out.println(img.size());

		for (int j = 0; j <= img.size() - 1; j++) {
			System.out.println(img.get(j).getText());

			Thread.sleep(1000);

			List<WebElement> in = driver.findElements(By.xpath("//input"));
			System.out.println(in.size());

			for (int k = 0; k <= in.size() - 1; k++) {
				System.out.println(in.get(k).getText());
			}

			Thread.sleep(1000);
			List<WebElement> but = driver.findElements(By.xpath("//button"));
			System.out.println(img.size());

			for (int l = 0; l <= but.size() - 1; l++) {
				System.out.println(but.get(l).getText());
			}
			driver.quit();
		}
	}
}