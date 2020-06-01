package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Jquery {


	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\chrome.exe");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepak\\Downloads\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver(options);


		driver.get("https://jqueryui.com/sortable/");

		driver.manage().window().maximize();

		driver.switchTo().frame(0);
		Thread.sleep(2000);

       WebElement item1 = driver.findElementByXPath("//ul[@id='sortable']/li[1]");
       WebElement item4 = driver.findElementByXPath("//ul[@id='sortable']/li[4]");
       
       //System.out.println(item4.getLocation().getX());
       //System.out.println(item4.getLocation().getY());

		Actions builder =new Actions(driver);
		
		Thread.sleep(2000);
		builder.dragAndDrop(item4, item1).perform();

	}
}
