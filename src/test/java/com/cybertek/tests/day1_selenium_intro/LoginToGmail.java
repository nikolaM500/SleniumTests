package com.cybertek.tests.day1_selenium_intro;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.*;

public class LoginToGmail {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gmail.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("identifierId")).sendKeys("nikola.markovic2014@gmail.com");
        driver.findElement(By.id("identifierNext")).click();

        driver.findElement(By.name("password")).sendKeys("novimejl");
        driver.findElement(By.id("passwordNext")).click();



    }
}
