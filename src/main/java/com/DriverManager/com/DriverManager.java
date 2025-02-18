package com.DriverManager.com;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Config.com.ConfigReader;

public class DriverManager {

	public static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null) {
			String browser = ConfigReader.getProperty("browser");

			if (browser.equalsIgnoreCase("chrome")) {
				
				driver = new ChromeDriver();
			} else {
				throw new RuntimeException("Browser not supported.");
			}
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
