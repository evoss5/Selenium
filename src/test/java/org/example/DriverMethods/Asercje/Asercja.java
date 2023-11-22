package org.example.DriverMethods.Asercje;

import org.example.Service;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Asercja {

    WebDriver driver;
    Service service;


    @BeforeMethod
    public void beforeTest() {

        driver = new ChromeDriver();
        service = new Service(driver);
        System.setProperty(service.getDriver(), service.chromeDriverURL());
        driver.get(service.getURL());
        driver.manage().window().maximize();

    }


    @Test
    public void Test() {
        String url = "https://pl.wikipedia.org/wiki/Wikipedia:Strona_g%C5%82%C3%B3wna";

        Assertions.assertAll(
                () -> Assertions.assertEquals(url, driver.getCurrentUrl(), "Strona nie jest prawidłowa"),
                () -> Assertions.assertEquals("Wikipedia, wolna encyklopedia", driver.getTitle(), "Tytuł strony jest nieprawidłowy")

        );

    }

    @Test
    public void Test2 () {
        driver.findElement(By.)

    }
}
