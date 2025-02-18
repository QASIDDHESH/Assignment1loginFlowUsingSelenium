package com.pages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	  private WebDriver driver;

	    
	    private By usernameField = By.xpath("//input[@id='user-name']");  
	    private By passwordField = By.xpath("//input[@id='password']");   
	    private By loginButton   = By.xpath("//input[@id='login-button']"); 

	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void enterUsername(String username) {
	        driver.findElement(usernameField).sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        driver.findElement(passwordField).sendKeys(password);
	    }

	    public void clickLogin() {
	        driver.findElement(loginButton).click();
	    }

	    public void login(String username, String password) {
	        enterUsername(username);
	        enterPassword(password);
	        clickLogin();
	        
	    }
}
