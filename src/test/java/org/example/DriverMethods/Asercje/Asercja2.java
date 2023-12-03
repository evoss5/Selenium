package org.example.DriverMethods.Asercje;

import Pages.FirstPage;
import com.sun.org.apache.bcel.internal.generic.ATHROW;
import org.example.Service;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Asercja2 {
    WebDriver driver;
    Service service;
    FirstPage page;


    @BeforeMethod
    public void beforeTest() {

        driver = new ChromeDriver();
        service = new Service(driver);
        System.setProperty(service.getDriver(), service.chromeDriverURL());
        driver.get(service.getURL());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void Test1() {
        page = new FirstPage(driver);
        service = new Service(driver);
        driver.get("http://localhost:8080/my-account/");
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();


        driver.get("http://localhost:8080/wp-admin/post-new.php?post_type=product");
        driver.findElement(By.id("_virtual")).click();
        WebElement shippingOptions = driver.findElement(By.className("shipping_options"));
        Assertions.assertFalse(shippingOptions.isDisplayed());


    }

    @Test
    public void Test2() {
        page = new FirstPage(driver);
        service = new Service(driver);
        driver.get("http://localhost:8080/my-account/");
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();


        driver.get("http://localhost:8080/wp-admin/edit.php?post_type=product");
        driver.findElement(By.id("cb-select-all-1")).click();

        List<WebElement> productCheckboxes = driver.findElements(By.name("post[]"));
        long numberOfSelectedCheckboxes = productCheckboxes.stream().filter(square -> square.isSelected()).count();
        Assertions.assertEquals(7, numberOfSelectedCheckboxes, "Not all checkboxes are enabled");





    }
}
