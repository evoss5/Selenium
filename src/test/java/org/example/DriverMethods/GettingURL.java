package org.example.DriverMethods;

import org.example.Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingURL {
    Service service;
    WebDriver driver;

    @BeforeEach
    public void driverSetup() {


        System.setProperty("webdriver.chrome.driver", "C:/driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


        @Test
                public void getCurrentURLExample() {
            String googleURL = "https://www.google.pl/";
            driver.navigate().to("https://google.pl");
            Assertions.assertEquals(googleURL, driver.getCurrentUrl(), "Current URL is not:" + googleURL);
        }
        @Test
    public void getTitleExample() {
        String googleTitle = "Google";
        driver.navigate().to("https://google.pl");
        Assertions.assertEquals(googleTitle, driver.getTitle(), "Current Title is not " + googleTitle);




        }


    }


