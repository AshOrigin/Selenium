package LetsKode.Myselenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class SauceDemoTest {

	WebDriver driver;
	@BeforeTest
	public void init() {
		
		driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com");
		
	}
	@Test(priority=1)
	public void LoginTest() {
		
		WebElement logininput = driver.findElement(By.id("user-name"));
		WebElement passwordinput = driver.findElement(By.id("password"));
		WebElement btnClick = driver.findElement(By.id("login-button"));
		
		logininput.sendKeys("standard_user");
		passwordinput.sendKeys("secret_sauce");
		btnClick.click();
		
	}
	@Test
	public void ProductSelect() {
		
		List<WebElement> productBtn = driver.findElements(By.className("btn_secondary btn_inventory"));
		WebElement s = productBtn.get(0);
		s.click();
		
	}
	
	public void afterTest() throws InterruptedException {
		
		Thread.sleep(10000);
		driver.quit();
		
	}

}
