package org.example;

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
        return "https://duckduckgo.com/";
    }
    public String chromeDriverURL() {
       return "webdriver.chrome.driver";

    }


    }






