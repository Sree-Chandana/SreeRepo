package ass2_ServiceNow;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//driver.get("https://www.google.com/");
	driver.get("https://dev77567.service-now.com/");
	Thread.sleep(3000);
	driver.findElementByXPath(("//div//input[@id='user_name']")).sendKeys("admin");
	
	
	//driver.findElementByName("PASSWORD").sendKeys("India@123");

}
}