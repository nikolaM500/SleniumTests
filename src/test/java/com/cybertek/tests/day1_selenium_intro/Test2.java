package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gmail.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("identifierId")).sendKeys("nikola.markovic2014@gmail.com");
        driver.findElement(By.id("identifierNext")).click();
        String at = driver.getTitle();
        String et = "gmail";
        driver.close();
        if (at.equalsIgnoreCase(et)){
            System.out.println("Test Successful");
        }else{
            System.out.println("Test Failed");
        }



    }
}
