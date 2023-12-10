package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage extends BasicPage {








    @FindBy (xpath = "//a[text()='Enter the Store']")
    private WebElement enterStoreLink;

    @FindBy(xpath = "//a[text()='Sign In']")
    private WebElement signOnLink;

    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@name='signon']")
    private WebElement signOnButton;

    @FindBy(xpath = "//li[text()='Invalid username or password.  Signon failed.']")
    public WebElement messageLabel;

    @FindBy(xpath = "//area[@alt=\"Fish\"]")
    private WebElement fishSmallIcon;

    public LandingPage(WebDriver driver) {
        super(driver);
    }






    public void signOnLinkClick() {
        signOnLink.click();
    }

    public void clickOnEnterStoreLink() {
        enterStoreLink.click();

    }
    public void inputUsernameField() {
        usernameField.sendKeys("j2ee");
    }
    public void inputPasswordField() {
        passwordField.sendKeys("j2ee");
    }
    public void clickSignOnButton() {
        signOnButton.click();
    }
    public void clickSmallFishButton() {
        fishSmallIcon.click();
    }

    public FishListPage goToFishListPage() {
        clickSmallFishButton();
        return new FishListPage(driver);
    }

}
