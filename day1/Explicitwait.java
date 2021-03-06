package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {


		public static void main(String[] args) throws InterruptedException {

			ChromeOptions options = new ChromeOptions();
			options.setBinary("C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\chrome.exe");

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepak\\Downloads\\chromedriver.exe");

			ChromeDriver driver = new ChromeDriver(options);


			driver.get("http://leafground.com");

			driver.manage().window().maximize();
			
			driver.findElementByXPath("(//a[@class='wp-categories-link maxheight']//following::a)[20]").click();
			WebDriverWait wait = new WebDriverWait (driver,30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[@id='btn']")));
			

            String text = driver.findElementByXPath("//strong[contains(text(),'Button is disappeared!')]").getText();
            System.out.println(text);
	}

}
