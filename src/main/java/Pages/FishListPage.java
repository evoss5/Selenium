package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FishListPage extends BasicPage {

    @FindBy(css = "tr:nth-child(2) a")
     private WebElement angelfishID;
    public FishListPage(WebDriver driver) {
        super(driver);
    }

    public void clickAngelFish() {
        angelfishID.click();

    }


}
