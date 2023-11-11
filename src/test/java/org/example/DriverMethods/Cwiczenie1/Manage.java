package org.example.DriverMethods.Cwiczenie1;

import org.example.Service;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.GregorianCalendar;
import java.util.Set;

public class Manage {
    WebDriver driver;
    Service service;



    @BeforeEach
    public void driverSetup() {


        System.setProperty("webdriver.chrome.driver", "C:/driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assertions.assertEquals(7, driver.manage().getCookies().size());

    }


@Test
    public void gettingCookies() {
        Set<Cookie> cookies = driver.manage().getCookies();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    Cookie cookieNamed = driver.manage().getCookieNamed("session-id");
    driver.manage().deleteCookieNamed("session-id");
    Assertions.assertEquals(6, driver.manage().getCookies().size(), "Number of cookies is not what expected.");

    driver.manage().deleteAllCookies();
    Assertions.assertEquals(0, driver.manage().getCookies().size(), "Number of cookies is..." );
}
@Test
    public void addingCookies() {
        Cookie newCookie = new Cookie("test_cookie", "test value", ".amazon.com", "/", new GregorianCalendar(2023, 11, 11 ).getTime(), true, true );
        driver.manage().addCookie(newCookie);
    Assertions.assertEquals(8, driver.manage().getCookies().size());
    Cookie secondCookie = new Cookie("test_cookie2", "test value2");
    Assertions.assertEquals(9, driver.manage().getCookies().size());

    driver.manage().deleteCookie(newCookie);
    Assertions.assertEquals(8, driver.manage().getCookies().size());





}


}

