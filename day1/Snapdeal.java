package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\chrome.exe");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepak\\Downloads\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver(options);


		driver.get("https://www.snapdeal.com/");

		driver.manage().window().maximize();

		WebElement men = driver.findElementByXPath("//span[@class='catText']");
		Actions builder =new Actions(driver);
		builder.moveToElement(men).perform();
        
		Thread.sleep(2000);

		driver.findElementByXPath("//span[text()='Shirts']").click();


		WebElement menshirt = driver.findElementByXPath("(//picture[@class='picture-elem']//img)[1]");

		builder.moveToElement(menshirt).perform();
		Thread.sleep(2000);

		driver.findElementByXPath("//div[@class='clearfix row-disc']/div").click();
		
		driver.close();
	}

}
