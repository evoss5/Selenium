package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopMenuPage extends BasicPage {


    @FindBy(xpath = "//a[text()='Sign In']")
    private WebElement signOnLink;

    public TopMenuPage(WebDriver driver) {
        super(driver);
    }

    public void signOnLinkClick() {
        signOnLink.click();
    }
}
