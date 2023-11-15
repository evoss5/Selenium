package org.example.Metody_lokalizujace;

import org.example.Service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Finding_elements {
    WebDriver driver;
    Service service;


    @BeforeEach
    public void beforeTest() {

        driver = new ChromeDriver();
        service = new Service(driver);
        System.setProperty(service.getDriver(), service.chromeDriverURL());
        driver.get(service.getURL());
        driver.manage().window().maximize();
    }


    @Test
    public void findingElementsByLinkText() {
        driver.findElement(By.linkText("Utwórz konto"));
        driver.findElement(By.partialLinkText("Zaloguj"));

    }
}
