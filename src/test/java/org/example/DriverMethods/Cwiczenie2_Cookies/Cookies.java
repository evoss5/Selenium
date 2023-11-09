package org.example.DriverMethods.Cwiczenie2_Cookies;

import org.example.Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {
    Service service;
    WebDriver driver;


    @BeforeEach
    public void driverSetup() {


        System.setProperty("webdriver.chrome.driver", "C:/driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://wikipedia.pl");

    }
    @Test
    public void cookiesExercises() {
        driver.manage().getCookies();
        Assertions.assertEquals(7, driver.manage().getCookies(), "Cookies size is not what expected" );


    }
}

