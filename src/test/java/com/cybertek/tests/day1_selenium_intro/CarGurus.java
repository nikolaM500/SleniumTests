package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CarGurus {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cargurus.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("carPickerUsed_makerSelect")).click();
        Select dropdown = new Select(driver.findElement(By.id("carPickerUsed_makerSelect")));
        dropdown.selectByVisibleText("Volkswagen");
        Select dropdown2 = new Select(driver.findElement(By.id("carPickerUsed_modelSelect")));
        dropdown2.selectByVisibleText("Touareg 2");
        driver.findElement(By.name("zip")).sendKeys("85251");
        //driver.findElement(By.id("dealFinderZipUsedId_dealFinderFrom")).sendKeys("85251");
        driver.findElement(By.id("dealFinderForm_0")).click();

        String actualResult = driver.getTitle();
        String expResult = "Used Volkswagen Touareg 2 for Sale in Scottsdale, AZ - CarGurus";

        if (actualResult.equalsIgnoreCase(expResult)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }









    }


}
