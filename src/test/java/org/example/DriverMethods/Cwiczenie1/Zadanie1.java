package org.example.DriverMethods.Cwiczenie1;

import org.example.Service;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie1 {
    Service service;
    WebDriver driver;


    @BeforeEach
    public void driverSetup() {
        System.setProperty("webdriver.chrome.driver", "C:/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @Test
    public void navigationTest() {
        driver.get("http://wikipedia.pl");
        driver.navigate().to("http://nasa.gov");
        driver.navigate().back();


        String wikipediaTitle = "Wikipedia, wolna encyklopedia";
        Assertions.assertEquals(wikipediaTitle, driver.getTitle(), "Tytuł strony nie jest " + wikipediaTitle);

        driver.navigate().forward();

        String nasaTitle = "NASA";
        Assertions.assertEquals(nasaTitle, driver.getTitle(), "Tytuł strony nie jest" + nasaTitle);

    }

}
