package com.cybertek.tests.day8_alerts_iframes_windows;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertsPractices {


    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

    }

    @Test

    //Locating the warning/information alert button to click it
    public void P1_information_alert_practice() {
        WebElement warningAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

        //click to button
        warningAlertButton.click();
        //1-Create Alert instance and switch to alert
        Alert alert = driver.switchTo().alert();

        BrowserUtils.wait(2);

        //2-Use 'alert' instance to accept the java script alert(popup)
        alert.accept();


        //Locating the result text web element
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //assert "resultText" is displayed
        Assert.assertTrue(resultText.isDisplayed(), "Result text is not displayed.Verification failed!!!");
    }
        @Test
         public void P2_confirmation_alert_practice(){

        //Locating the warning/information alert button to click it
                WebElement warningAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));

                //click to button
                warningAlertButton.click();
    Alert alert = driver.switchTo().alert();
    alert.accept();
    //alert.dismiss();
    //we can either accept(); or dismiss(); the confirmation alert

        //Locating the result text web element
        WebElement resultText=driver.findElement(By.xpath("//p[@id='result']"));

        //Assert
            Assert.assertTrue(resultText.isDisplayed(),"Text is not displayed.Verification FAILED!!!");
    }

}
