package com.BaseClass.com;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Config.com.ConfigReader;
import com.DriverManager.com.DriverManager;
import com.utils.com.LoggerForLog4j;



public class BaseTest {
	protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = DriverManager.getDriver();
        driver.get(ConfigReader.getProperty("url"));
        LoggerForLog4j.log.info("Navigating to URL:");
    }

    @AfterMethod
    public void tearDown() {
    	LoggerForLog4j. log.info("Closing browser session");
    	DriverManager.quitDriver();
    }
	
}
