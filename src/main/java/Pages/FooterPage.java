package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterPage extends BasicPage {


    @FindBy(xpath = "//img[@src='../images/banner_dogs.gif']")
    private WebElement bannerAfterLoginLogo;

    public FooterPage(WebDriver driver) {
        super(driver);
    }

    public boolean isBannerAfterLoginDisplayed() {
        boolean isDisplayed = bannerAfterLoginLogo.isDisplayed();

        return isDisplayed;
    }

}
