package org.example.DriverMethods.Cwiczenie3;

import org.example.Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page {
    Service service;
    WebDriver driver;


    @BeforeEach
    public void driverSetup() {


        System.setProperty("webdriver.chrome.driver", "C:/driver/chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("http://wikipedia.pl");
    }

    @Test
    public void windowSettings() {
        Dimension size = new Dimension(845, 480);
         driver.manage().window().setSize(size);

         Point position = new Point(445, 30 );
         driver.manage().window().setPosition(position);

        Assertions.assertEquals(size, driver.manage().window().getSize(), "Size of the windows is not:" + size.width + ",  " + size.height);

        Assertions.assertEquals(position, driver.manage().window().getPosition(), "Window position is not :" + position.x + ", " + position.y);






}
}