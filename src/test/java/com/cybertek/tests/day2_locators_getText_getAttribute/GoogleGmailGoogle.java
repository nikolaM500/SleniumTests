package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleGmailGoogle {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Gmail")).click();

        String expTitle = "gmail";
        String actTitle = driver.getTitle().toLowerCase();
        if (actTitle.contains(expTitle)){
            System.out.println("Step one passed!");
        }else{
            System.out.println("step 1 failed!");
        }

        driver.navigate().back();

        expTitle = "google";
        actTitle = driver.getTitle().toLowerCase();
        if (actTitle.contains(expTitle)){
            System.out.println("Step two passed!");
        }else{
            System.out.println("step 2 failed!");
        }


    }

}
