package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameApple {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys("apple");
        driver.findElement(By.name("btnK")).click();

        String expTitle = "apple";
        String acctTitle = driver.getTitle();

        if (acctTitle.contains(expTitle)){
            System.out.println("Test passed!");
        }else{
            System.out.println("Test failed!");
        }


    }

}
