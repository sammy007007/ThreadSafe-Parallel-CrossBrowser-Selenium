package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DriverFactory {
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<>();

	public static WebDriver getDriver() {
		return tdriver.get();
	}

	public static void removeDriver() {
		tdriver.get().quit();
		tdriver.remove();
	}

}