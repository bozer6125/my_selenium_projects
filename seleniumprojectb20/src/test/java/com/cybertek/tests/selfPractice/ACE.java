package com.cybertek.tests.selfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ACE {
    public static void main(String[] args) {


        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        // 2.Go to http://Ace.edu
        driver.get("http://Ace.edu");

        //3.Close the page
        driver.close();
        //4.What is difference quit()-close()
        driver.quit();
    }
}

