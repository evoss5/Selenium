import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShoppingCartTest extends Testing {

    WebDriver driver;
    Service service;
    FishListPage fishListPage;
    LandingPage landingPage;
    LoginPage login;
    TopMenuPage topMenuPage;
    FooterPage footerPage;
    WebDriverWait wait;
    BasicPage basicPage;



    @BeforeMethod
    public void beforeTest() {

        driver = new ChromeDriver();
        service = new Service(driver);

        System.setProperty(service.getDriver(), service.chromeDriverURL());
        driver.get(service.getURL2());
        driver.manage().window().maximize();
    }

    @Test
    public void Test() {
        landingPage = new LandingPage(driver);
        basicPage = new BasicPage(driver);
        landingPage.clickOnEnterStoreLink();
        landingPage.clickSmallFishButton();
        fishListPage = new FishListPage(driver);
        fishListPage.clickAngelFish();





    }

}
