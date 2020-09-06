package com.cybertek.tests.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*1.Open Chrome browser
2.Go to http://practice.cybertekschool.com/forgot_password
3.Enter any email into input box
4.Click on Retrieve password
5.Verify URL contains: Expected: “email_sent”
6.Verify text-box displayed the content as expected.Expected: “Your e-mail’s been sent!*/
public class Practice3 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();
        driver.findElement(By.name("email")).sendKeys("kanj.slonovic@gmail.com"/*+ Keys.ENTER*/);
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();
        String expRes = "email_sent";
        String accRes = driver.getCurrentUrl();
        checkIFContains(accRes,expRes);
        accRes=driver.findElement(By.name("confirmation_message")).getText();
        expRes="Your e-mail's been sent!";
        checkIfMatches(accRes,expRes);
        System.out.println(driver.findElement(By.id("content")).isDisplayed());


        driver.close();



    }
    public static void checkIfMatches(String exp, String acc){
        if (exp.equalsIgnoreCase(acc)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
    }

    public static void checkIFContains(String acc, String exp ){
        if (acc.contains(exp)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
    }

}
