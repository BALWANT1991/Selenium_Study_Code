package actions_Perform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Automation\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        Thread.sleep(500);
        driver.manage().window().maximize();
        Thread.sleep(200);
        
        driver.switchTo().frame(3);
        
        WebElement src = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
        WebElement dest = driver.findElement(By.xpath("//div[@id=\"trash\"]"));
        Actions act= new Actions(driver);
        act.dragAndDrop(src, dest).perform();
        
        Thread.sleep(500);
        WebElement src1 = driver.findElement(By.xpath("//img[@src='images/high_tatras2_min.jpg']"));
        WebElement dest1 = driver.findElement(By.xpath("//div[@id=\"trash\"]"));
        Actions act1= new Actions(driver);
        act1.dragAndDrop(src1, dest1).perform();

        Thread.sleep(500);
        WebElement src2 = driver.findElement(By.xpath("//img[@src='images/high_tatras3_min.jpg']"));
        WebElement dest2 = driver.findElement(By.xpath("//div[@id=\"trash\"]"));
        Actions act2= new Actions(driver);
        act2.dragAndDrop(src2, dest2).perform();
        
        Thread.sleep(500);
        WebElement src3 = driver.findElement(By.xpath("//img[@src='images/high_tatras4_min.jpg']"));
        WebElement dest3 = driver.findElement(By.xpath("//div[@id=\"trash\"]"));
        Actions act3= new Actions(driver);
        act3.dragAndDrop(src3, dest3).perform();

        Thread.sleep(5000);
        
      //reverse drag n drop:
        
        //driver.switchTo().frame(2);
        WebElement d4 = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
        WebElement s4 = driver.findElement(By.xpath("//ul[@id='gallery']"));
        Actions ac4= new Actions(driver);
        ac4.dragAndDrop(d4,s4).perform();
        
        WebElement d5 = driver.findElement(By.xpath("//img[@src='images/high_tatras2_min.jpg']"));
        WebElement s5 = driver.findElement(By.xpath("//ul[@id='gallery']"));
        Actions ac5= new Actions(driver);
        ac5.dragAndDrop(d5,s5).perform();
        
        WebElement d6 = driver.findElement(By.xpath("//img[@src='images/high_tatras3_min.jpg']"));
        WebElement s6 = driver.findElement(By.xpath("//ul[@id='gallery']"));
        Actions ac6= new Actions(driver);
        ac6.dragAndDrop(d6,s6).perform();
        
        WebElement d7 = driver.findElement(By.xpath("//img[@src='images/high_tatras4_min.jpg']"));
        WebElement s7 = driver.findElement(By.xpath("//ul[@id='gallery']"));
        Actions ac7= new Actions(driver);
        ac7.dragAndDrop(d7,s7).perform();
        
        driver.quit();
       
 
	}
	
	
}
