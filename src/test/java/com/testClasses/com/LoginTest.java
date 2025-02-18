package com.testClasses.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.BaseClass.com.BaseTest;
import com.Config.com.ConfigReader;
import com.DataProvider.com.LoginDataProvider;
import com.pages.com.LoginPage;
import com.utils.com.LoggerForLog4j;
import com.utils.com.RetryAnalyzer;
import com.utils.com.ScreenshotUtil;

public class LoginTest extends BaseTest {
    @Test(dataProvider = "loginData", dataProviderClass = LoginDataProvider.class, retryAnalyzer = RetryAnalyzer.class)

	    public void testLogin(String username, String password) {
	        try {
	        	
	            LoginPage loginPage = new LoginPage(driver);
	            
	            WebElement confirmloginpage = driver.findElement(By.className("login_container"));
	            Assert.assertTrue(confirmloginpage.isDisplayed(), "Login page not displayed.");
           
	            loginPage.login(username, password);
	            LoggerForLog4j.log.info("Login attempted with username: " + username);


	            Thread.sleep(2000);
           
	            WebElement dashboard = driver.findElement(By.xpath("//span[contains(text(), 'Products')]")); 
	            Assert.assertTrue(dashboard.isDisplayed(), "Dashboard is not displayed. Login might have failed.");

	        } catch (Exception e) {
	           LoggerForLog4j.log.error("Login test failed for user: " + username + " due to exception: ", e);
	            ScreenshotUtil.captureScreenshot(driver, "LoginTest_Failure");
	            Assert.fail("Test failed due to exception: " + e.getMessage());
	        }
	    }
}
