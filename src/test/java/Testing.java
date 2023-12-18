import Pages.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Testing {
    WebDriver driver;
    Service service;
    WebDriverWait wait;


    @BeforeMethod
    public void beforeTest() {

        driver = new ChromeDriver();
        service = new Service(driver);

        System.setProperty(service.getDriver(), service.chromeDriverURL());
        driver.get(service.getURL2());
        driver.manage().window().maximize();
    }

    @Test
    public void asUserTryToLogInWithIncorrectLoginAndPassword() {

        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnEnterStoreLink();
        landingPage.signOnLinkClick();
        landingPage.inputUsernameField();
        landingPage.inputPasswordField();
        landingPage.clickSignOnButton();
        WebElement messageLabel = driver.findElement(By.xpath("//li[text()='Invalid username or password.  Signon failed.']"));

        Assertions.assertEquals(messageLabel.getText(), "Invalid username or password. Signon failed.");


    }

    @Test
    public void asUserTryToLogInWithIncorrectLoginAndPassword2() {

        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnEnterStoreLink();

        TopMenuPage topMenuPage = new TopMenuPage(driver);
        topMenuPage.signOnLinkClick();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeIntoUserNameField("admin");
        loginPage.typeIntoPasswordField("admin");
        loginPage.clickOnLoginButton();
        String warningMessage = loginPage.getWarningMessage();

        assertEquals(warningMessage, "Invalid username or password. Signon failed.");
    }

    @Test
    public void asUserLoginUsingValidLoginAndPassword() {

        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnEnterStoreLink();

        TopMenuPage topMenuPage = new TopMenuPage(driver);
        topMenuPage.signOnLinkClick();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeIntoUserNameField("j2ee");
        loginPage.clickOnLoginButton();
        FooterPage footerPage = new FooterPage(driver);
        Assertions.assertTrue(footerPage.isBannerAfterLoginDisplayed());
        
    }


    }




