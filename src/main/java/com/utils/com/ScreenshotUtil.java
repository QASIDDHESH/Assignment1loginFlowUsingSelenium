package com.utils.com;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {
	public static void captureScreenshot(WebDriver driver, String testName) {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String filePath = ".screenshots/" + testName + "_" + timestamp + ".png";

        try {
            FileUtils.copyFile(srcFile, new File(filePath));
            System.out.println("Screenshot saved at: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
