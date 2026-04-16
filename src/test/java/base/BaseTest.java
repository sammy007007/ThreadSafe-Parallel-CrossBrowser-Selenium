package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utils.*;

public class BaseTest extends DriverFactory {

	@Parameters("browserName")
	@BeforeMethod
	public WebDriver setup(String browser) {
		WebDriver driver;

		switch (browser.toLowerCase()) {
		
		case "chrome":
			DriverFactory.tdriver.set(new ChromeDriver());
			driver = getDriver();
			break;
			
		case "edge":
			DriverFactory.tdriver.set(new EdgeDriver());
			driver = getDriver();
			break;
			
		default:
			DriverFactory.tdriver.set(new ChromeDriver());
			driver = getDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return driver;
	}

	@AfterMethod
	public void tearDown() {
		if (getDriver() != null) {
			removeDriver();
		}
	}
}
