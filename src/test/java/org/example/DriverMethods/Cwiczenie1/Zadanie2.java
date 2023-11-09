package org.example.DriverMethods.Cwiczenie1;

import org.example.Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie2 {
    Service service;
    WebDriver driver;


    @BeforeEach
    public void driverSetup() {


        System.setProperty("webdriver.chrome.driver", "C:/driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

        @Test
                public void Testing() {
            driver.navigate().to("https://pl.wikipedia.org/");
            String wikiTitle = "Wikipedia, wolna encyklopedia";
            Assertions.assertEquals(wikiTitle, driver.getTitle(), "Tutuł niezgodny z " + wikiTitle);

            String expectedURL = "https://pl.wikipedia.org/wiki/Wikipedia:Strona_g%C5%82%C3%B3wna";
            Assertions.assertTrue(driver.getCurrentUrl().contains(expectedURL));
            String polishLanguage = "lang=\"pl\" ";

            Assertions.assertTrue(driver.getPageSource().contains(polishLanguage), "Strona nie jest po polsku" + polishLanguage) ;

            driver.findElement(By.id("p-lang-btn-checkbox")).click();
            driver.findElement(By.cssSelector("a[title='hiszpanski']")).click();

            String wikiSpainTitle = "Wikipedia, la enciclopedia libre";
            Assertions.assertEquals(wikiSpainTitle, driver.getTitle(), "Tutuł niezgodny z " + wikiSpainTitle);

            String expectedSpainURL = "http://es.wikipedia.org/wiki/Wikipedia:Portada";
            Assertions.assertEquals(expectedSpainURL, driver.getCurrentUrl(), "URL niezgodne z " + expectedSpainURL);
            String spainLanguage = "lang=\"es\"";
            Assertions.assertTrue(driver.getPageSource().contains(spainLanguage), "Strona nie jest po polsku" + spainLanguage) ;





            ;


        }

    }


