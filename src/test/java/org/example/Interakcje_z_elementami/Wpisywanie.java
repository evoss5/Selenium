package org.example.Interakcje_z_elementami;

import org.example.Service;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Wpisywanie {
    WebDriver driver;
    Service service;

    @BeforeMethod
    public void beforeTest() {

        driver = new ChromeDriver();
        service = new Service(driver);


        System.setProperty(service.getDriver(), service.chromeDriverURL());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // driver.manage().timeouts().pageLoadTimeout( TimeUnit.SECONDS);
    }


    @Test
    public void wpisywanieTest() {
        driver.get("http://localhost:3000/#/");
        WebElement dismissClick = driver.findElement(By.xpath(".//button[@aria-label='Close Welcome Banner']"));
        dismissClick.click();

        driver.findElement(By.xpath(".//*[@id='navbarAccount']")).click();
        driver.findElement(By.xpath(".//button[@aria-label='Go to login page']")).click();

        driver.findElement(By.name("email")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.id("loginButton")).click();

        driver.findElement(By.xpath("//div//h1/following-sibling::div"));
        Assertions.assertDoesNotThrow(() -> driver.findElement(By.xpath("//div//h1/following-sibling::div")), "The account is not valid");


    }
}
