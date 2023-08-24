package selenium_Package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Excel_sheet_Data {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream file = new FileInputStream("C:\\Selenium_Automation\\Excel_sheet\\Data Sheet.xlsx");

		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");

		String data = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);

		String data1 = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(data1);

		String data2 = sheet.getRow(2).getCell(0).getStringCellValue();
		System.out.println(data2);

		String data3 = sheet.getRow(3).getCell(0).getStringCellValue();
		System.out.println(data3);

		String data4 = sheet.getRow(4).getCell(0).getStringCellValue();
		System.out.println(data4);

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Automation\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805031%7Ce%7Cfcabook%7C&placement=&creative=550525805031&keyword=fcabook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221112%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-325251762436%26loc_physical_ms%3D9062096%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw7vuUBhBUEiwAEdu2pKBFreldHOwBlVWz_f9-K6uEfhLX5lhf1b1kHEXX4_mOmsa7bcIruBoCjQQQAvD_BwE");

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(data);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(data1);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(data2);
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(data3);
		driver.findElement(By.xpath("//*[@id=\"password_step_input\"]")).sendKeys(data4);

		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s = new Select(day);
		s.selectByIndex(30);

		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s1 = new Select(month);
		s1.selectByIndex(6);

		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s2 = new Select(year);
		s2.selectByValue("1992");

		driver.findElement(By.xpath("//input[@value='2']")).click();
		// driver.findElement(By.xpath("//button[@name='websubmit']")).click();

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
		driver.quit();

	}
}
