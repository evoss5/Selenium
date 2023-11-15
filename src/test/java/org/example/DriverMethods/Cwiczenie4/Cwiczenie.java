package org.example.DriverMethods.Cwiczenie4;

import org.example.Service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cwiczenie {
    WebDriver driver;
    Service service;


    @BeforeEach
    public void beforeTest() {
        driver = new ChromeDriver();
        service = new Service(driver);
        System.setProperty(service.getDriver(), service.chromeDriverURL());
        driver.get("https://fakestore.testelka.pl/moje-konto/");
        driver.manage().window().maximize();
    }

    @Test
    public void Test1() {
        driver.findElement(By.id("woocommerce-product-search-field-0"));
        driver.findElement(By.className("search-field"));    // szukajka


        //okno hasła
        driver.findElement(By.id("password"));
        driver.findElement(By.name("password"));

        //przycisk logowania
        driver.findElement(By.name("login"));

        //checkbox zapamiętywania
        driver.findElement(By.id("rememberme"));


        //link do przypominania hasła

        driver.findElement(By.linkText("Nie pamiętasz hasła?"));

        //kategoria żeglarstwo

        driver.findElement((By.linkText("Żeglarstwo")));


    }
        @Test
                public void Test2() {
        

        }



    }


