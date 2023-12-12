package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasicPage{



    @FindBy(xpath = "//div[@class='wc-block-mini-cart__footer-actions']/a[2]")
    WebElement goToCheckOut;
    public CartPage(WebDriver driver) {
        super(driver);


    }
    public void clickGoTocheckout() {
        wait.until(ExpectedConditions.visibilityOf(goToCheckOut));
        goToCheckOut.click();
    }
}
