package org.example.DriverMethods.Cwiczenie2_Cookies;

import org.example.Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {
    Service service;
    WebDriver driver;


    @BeforeEach
    public void driverSetup() {


        System.setProperty("webdriver.chrome.driver", "C:/driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1290, 730));
        driver.manage().window().setPosition(new Point(8, 30));
        driver.navigate().to("http://wikipedia.pl");

    }

    @Test
    public void cookiesExercises() {
        driver.manage().getCookies();
        Assertions.assertEquals(7, driver.manage().getCookies(), "Cookies size is not what expected");


    }

    @Test
    public void windowsSettings() {
        Point position = driver.manage().window().getPosition();
        Assertions.assertEquals(new Point(8, 30), position, "Position of windows is now what expected");

        Dimension size = driver.manage().window().getSize();
        Assertions.assertEquals(new Dimension(1290, 730), size, "Size of the window is now what expected");
        driver.manage().window().fullscreen();

        driver.manage().window().maximize();
    }

}

