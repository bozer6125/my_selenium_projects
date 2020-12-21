package com.cybertek.tests.day8_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IFramePractices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/iframe");

    }
        @Test
        public void P4_iframe_practice(){
        //3 ways of locating.
            //1.By index
            driver.switchTo().frame(0);
            //2.By Id or Name:passing id attribute value
            //driver.switchTo().frame(mce_0_ifr);
            //3.Locate as a web element,then switch to it


        //Locating paragraph tag as a web element.
            WebElement yourContentGoesHereText=driver.findElement(By.xpath("//p"));

        //Assert "YOur content goes here."

    }
}