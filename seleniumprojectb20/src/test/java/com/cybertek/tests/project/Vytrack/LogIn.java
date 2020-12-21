package com.cybertek.tests.project.Vytrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa2.vytrack.com/");
        driver.findElement(By.id("prependedInput")).sendKeys("user166");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123" + Keys.ENTER);


    }
}
