package lointest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class LoginTest {
	public static WebDriver driver;
	public void setup() {
		 driver = new ChromeDriver();
	}
	public void doLogin() {
		//driver.get("")
	}
	@AfterSuite
	public void tearDown() {
		
	}

}
