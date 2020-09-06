package com.cybertek.tests.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2eroBankVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");
        driver.manage().window().maximize();

        //        3. Verify link text from top left:
//        Expected: “Zero Bank”
        WebElement zeroBankLinkTopLeft = driver.findElement(By.className("brand"));

        String expectedLinkText = "Zero Bank";
        String actualLinkText = zeroBankLinkTopLeft.getText();

        if (actualLinkText.equals(expectedLinkText)) {
            System.out.println("Link text verification PASSED!");
        }else{
            System.out.println("Link text verification FAILED!!!");
        }

//        4. Verify link href attribute value contains:
//        Expected: “index.html”
        String expectedInHref = "index.html";
        String actualHrefValue =  zeroBankLinkTopLeft.getAttribute("href");

        //System.out.println("expectedInHref = " + expectedInHref);
        //System.out.println("actualHrefValue = " + actualHrefValue);

        if (actualHrefValue.contains(expectedInHref)){
            System.out.println("Href value verification PASSED!");
        }else{
            System.out.println("Href value verification FAILED!!!");
        }





    }
}
