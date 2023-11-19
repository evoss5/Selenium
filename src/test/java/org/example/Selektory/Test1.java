package org.example.Selektory;

import org.example.Service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test1 {
    WebDriver driver;
    Service service;

    @BeforeEach
    public void beforeTest() {

        driver = new ChromeDriver();
        service = new Service(driver);
        System.setProperty(service.getDriver(), service.chromeDriverURL());
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    @Test
    public void Test1() {
        driver.navigate().to("https://fakestore.testelka.pl/product/grecja-limnos/");
        driver.findElement(By.cssSelector(".woocommerce-store-notice__dismiss-link")).click();
        driver.findElement(By.cssSelector("a.add_to_wishlist")).click();
        driver.findElement(By.cssSelector("span.feedback")).click();
    }

}

