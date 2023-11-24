package org.example.Interakcje_z_elementami;

import org.example.Service;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Klikanie {

    WebDriver driver;
    Service service;



    @BeforeMethod
    public void beforeTest() {

        driver = new ChromeDriver();
        service = new Service(driver);
        System.setProperty(service.getDriver(), service.chromeDriverURL());
        driver.manage().window().maximize();
    }


        @Test
    public void clickTest() {

        driver.get("https://www.amazon.com/");

        WebElement clickIcon = driver.findElement(By.xpath(".//img[@alt='Beauty steals under $25']"));
        clickIcon.click();

        driver.findElement(By.xpath(".//img[contains(@alt,'Viviscal')]")).click();

        WebElement addToCartButton = driver.findElement(By.xpath("add-to-cart-button"));
        addToCartButton.click();


    }
}
