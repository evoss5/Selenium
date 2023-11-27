package org.example.Interakcje_z_elementami;

import Pages.FirstPage;
import org.example.Service;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Wpisywanie2 {
    WebDriver driver;
    Service service;
    WebDriverWait webDriverWait;
    FirstPage firstPage;



    @BeforeMethod
    public void beforeTest() {

        driver = new ChromeDriver();
        service = new Service(driver);
        System.setProperty(service.getDriver(), service.chromeDriverURL());
        driver.get(service.getURL());
        driver.manage().window().maximize();
    }




    @Test

    public void Test1() {
        firstPage = new FirstPage(driver);
        firstPage.searchFieldInsertText();
        firstPage.searchButtonClick();
        firstPage.addProductToCart();
        firstPage.cartIconStatusCheck();
        firstPage.timeoutForPage();
        firstPage.goToCheckOutClick();

    }




}