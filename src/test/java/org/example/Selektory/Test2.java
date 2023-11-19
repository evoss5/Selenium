package org.example.Selektory;

import org.example.Service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test2 {

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
    public void Test2(){
        driver.navigate().to("http://www.amazon.com/");
        driver.findElement(By.xpath(".//span[@class='nav-line-2 ']")).click();
        driver.findElement(By.xpath(".//span[@class='a-expander-prompt']")).click();
        driver.findElement(By.xpath(".//*[contains(text(),' Forgot your password?')]")).click();
        driver.navigate().back();
        driver.findElement(By.xpath(".//span[@class='a-expander-prompt']")).click();
        driver.findElement(By.xpath(".//a[contains(text(),'Other issues with Sign-In')]")).click();
    }

}


