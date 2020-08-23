package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank {

    public static void main(String[] args) {

        /*TC #6: Zero Bankheader verification1.Open Chrome browser2.Go to
         http://zero.webappsecurity.com/login.html3.
         Verify header textExpected: “Log in to ZeroBank”*/

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");
        driver.manage().window().maximize();

        String expact = "Log in to ZeroBank";
        String actual = driver.findElement(By.tagName("h3")).getText();

        if (expact.equalsIgnoreCase(actual)){
            System.out.println("Test passed!");
        }else{
            System.out.println("Test failed!");
        }


    }


}
