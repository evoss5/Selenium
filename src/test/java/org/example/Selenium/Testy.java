package org.example.Selenium;

import Pages.BasicPage;
import Pages.CartPage;
import org.example.Service;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Testy {


    WebDriver driver;
    Service service;
    WebDriverWait wait;

    BasicPage page;
    CartPage cart;




    @BeforeMethod
    public void beforeTest() {

        driver = new ChromeDriver();
        service = new Service(driver);
        page = new BasicPage(driver);
        System.setProperty(service.getDriver(), service.chromeDriverURL());
        driver.get(service.getURL());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        ;

    }

    @Test
    public void Test1() {
        WebElement searchField = driver.findElement(By.id("wc-block-search__input-1"));
        Assertions.assertEquals("wc-block-product-search__field", searchField.getAttribute("class"), "Placeholder is not correct");


    }

    @Test
    public void Test2() {
        String cssValuse = driver.findElement(By.xpath("//button[@type='submit']")).getCssValue("background-color");
        System.out.println(cssValuse);

    }

    @Test
    public void no_changes_made_should_save_button_disabled() {
        driver.get("http://localhost:8065/login/");
        WebDriverWait wait = new WebDriverWait(driver, TimeUnit.SECONDS.toSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input_loginId"))).sendKeys("test");
        driver.findElement(By.id("input_password-input")).sendKeys("test123");
        driver.findElement(By.id("saveSetting")).click();
        wait.until(ExpectedConditions.numberOfElementsToBe(By.id("loadingSpinner"), 0));
        driver.get("http://localhost:8065/admin_console/user_management/permissions/system_scheme");
        WebElement addTeamMembersCheckbox = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("saveSetting")));
        Assertions.assertFalse(addTeamMembersCheckbox.isEnabled(),
                "\"Save\" button is enabled even though no changes were made");
    }

    @Test
    public void selectAllPostsShouldSelectEachOfThem() {
        driver.get(service.getURL() + "/my-account/");

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin");
        WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
        Assertions.assertTrue(loginButton.isDisplayed());
        loginButton.click();


        driver.get("http://localhost:8080/wp-admin/edit.php?post_type=product");


        Assertions.assertEquals("http://localhost:8080/wp-admin/edit.php?post_type=product", driver.getCurrentUrl(), "Page is not desired");
        driver.findElement(By.xpath("//input[@id='cb-select-all-1']")).click();


        List<WebElement> productCheckboxes = driver.findElements(By.name("post[]"));
        long numberOfSelectedCheckboxes = productCheckboxes.stream().filter(WebElement::isSelected).count();

        Assertions.assertEquals("7", numberOfSelectedCheckboxes, "Not all checkboxes are selected");


    }

    @Test
    public void loginTest() {
        driver.get(service.getURL() + "/my-account/");

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin");
        WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
        Assertions.assertTrue(loginButton.isDisplayed());

        WebElement rememberMeCheckBox = driver.findElement(By.xpath("//input[@id=\"rememberme\"]"));
        rememberMeCheckBox.click();

        boolean isItSelected = rememberMeCheckBox.isSelected();
        Assertions.assertTrue(isItSelected);


    }

    @Test
    public void iFrameTest() throws InterruptedException {
        page = new BasicPage(driver);
        cart = new CartPage(driver);

        driver.get(service.getURL() + "/my-account/");

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin");
        WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
        Assertions.assertTrue(loginButton.isDisplayed());
        loginButton.click();
        driver.findElement(By.xpath("//aside[@id='block-12']")).click();
        cart.clickGoTocheckout();
        driver.findElement(By.xpath("//input[@id='billing_first_name']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='billing_last_name']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='billing_postcode']")).sendKeys("11222");
        driver.findElement(By.xpath("//input[@id='billing_city']")).sendKeys("randomname");
        driver.findElement(By.xpath("//input[@id='billing_phone']")).sendKeys("231344412");
        driver.findElement(By.xpath("//input[@id=\"billing_address_1\"]")).sendKeys("Warszawa");
        WebElement frame = driver.findElement(By.xpath("//div[@id='stripe-card-element']//iframe"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("//input[@name='cardnumber' and @data-elements-stable-field-name='cardNumber']")).sendKeys("2388383838383899");
        driver.switchTo().defaultContent();
        WebElement expiryDateFrame = driver.findElement(By.xpath("//div[@id='stripe-exp-element']//iframe"));
        driver.switchTo().frame(expiryDateFrame);
        driver.findElement(By.xpath("//input[@name='exp-date']")).sendKeys("0224");
        driver.switchTo().defaultContent();
        WebElement cvcCode = driver.findElement(By.xpath("//div[@id='stripe-cvc-element']//iframe"));
        driver.switchTo().frame(cvcCode);
        driver.findElement(By.xpath("//input[@name='cvc']")).sendKeys("762");
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//button[@id=\"place_order\"]")).click();
        WebElement messege = driver.findElement(By.xpath("//ul[@class='woocommerce-error']"));
        boolean isMessageVisible = messege.isDisplayed();
        Assertions.assertEquals("Billing Postcode / ZIP is not a valid postcode / ZIP.", messege.getText());
        Assertions.assertTrue(isMessageVisible);



    }
}















