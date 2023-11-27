package org.example;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Service {
    WebDriver driver;
    WebDriverWait webDriverWait;

    public Service(WebDriver driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }


    public String getDriver() {
        return "C:/driver/chromedriver.exe";
    }


    public String getURL() {
        return "http://localhost:8080/";
    }

    public String chromeDriverURL() {
        return "webdriver.chrome.driver";

    }

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
}






