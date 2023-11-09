package org.example;

import Pages.FirstPage;
import com.google.common.annotations.VisibleForTesting;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static org.junit.jupiter.api.Assertions.assertTrue;
    public class FirstAutomatedTest {

        Service service;

        FirstPage firstPage;

        private WebDriver driver;

        @Test

        @BeforeMethod
        public void beforeTest() {

            driver = new ChromeDriver();
            service = new Service(driver);
            System.setProperty(service.getDriver(), service.chromeDriverURL());
            driver.get(service.getURL());
            driver.manage().window().maximize();
        }

        @Test
        public void myFirstTest() {


        }

//        @AfterMethod
//        public void afterTest() {
//            driver.close();
//            driver.quit();
//        }
    }


