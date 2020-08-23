package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

    public static void main(String[] args) throws InterruptedException {
                                            // needed for Thread.sleep() to work

        // 1 - set up the web driver
        WebDriverManager.chromedriver().setup();

        // 2 - create the instance of the crome driver

        WebDriver driver = new ChromeDriver();

        // 3 - test if driver is working

        driver.get("https://www.google.com");

        Thread.sleep(3000);

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());








    }

}
