package com.DataProvider.com;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {
	@DataProvider(name = "loginData")
    public static Object[][] getLoginData() {
        return new Object[][] {
               
           
            {"problem_user", "secret_sauce"},
            {"performance_glitch_user", "secret_sauce"}
        };
    }
}
