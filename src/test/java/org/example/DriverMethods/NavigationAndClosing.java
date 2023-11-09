package org.example.DriverMethods;

import org.example.Service;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationAndClosing {
    Service service;
    WebDriver driver;

    @BeforeEach
    public void driverSetup() {


        System.setProperty("webdriver.chrome.driver", "C:/driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterEach
    public void driverQuit() {
        driver.close();
        driver.quit();
    }


    @Test
    public void getMethod() {


        driver.get("http://google.pl");


    }

    @Test
    public void navigate() {
        driver.navigate().to("http://google.pl");



        driver.navigate().to("https://www.amazon.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


    }
}
