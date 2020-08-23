package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginBookIt {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://cybertek-reservation-qa.herokuapp.com/");



        driver.findElement(By.name("email")).sendKeys("sdarben7g@alibaba.com");
        driver.findElement(By.name("password")).sendKeys("angiecoatham");
        driver.findElement(By.cssSelector("button")).click();



    }

}
