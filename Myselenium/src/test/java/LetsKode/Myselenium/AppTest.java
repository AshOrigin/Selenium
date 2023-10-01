package LetsKode.Myselenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
public class AppTest {
	WebDriver driver;
	@BeforeTest
	public void init() {
		driver = new FirefoxDriver();
		driver.get("http://www.saucedemo.com/");
		
	}
	@Test(priority=1)
	
	public void testing() {
		String actual = driver.getTitle();
		String expected = "Swag Labs";
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
	}
	@Test(priority=2)
	public void testing2() {
		String ActualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.saucedemo.com/";
		Assert.assertEquals(ActualURL, expectedURL);
	}
	
	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
	}
	
	

}
