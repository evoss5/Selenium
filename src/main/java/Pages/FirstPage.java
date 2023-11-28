package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class FirstPage extends BasicPage {

    public FirstPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(id = "wc-block-search__input-1")
    WebElement searchField;

    @FindBy(xpath = ".//*[@name='add-to-cart']")
    WebElement addProductToCart;

    @FindBy(xpath = ".//button[@aria-label='Search']")
    WebElement searchButton;

    @FindBy(className = "wc-block-mini-cart__quantity-badge")
    WebElement cartIcon;

    @FindBy(className = "wc-block-components-button__text")
    WebElement goToCheckOut;


    public void searchFieldInsertText() {

        webDriverWait.until(ExpectedConditions.elementToBeClickable(searchField));
        //searchField.click();
        searchField.sendKeys("popular");
    }

    public void addProductToCart() {
        addProductToCart.click();
    }

    public void searchButtonClick() {
        searchButton.click();
    }

    public void cartIconStatusCheck() {
        cartIcon.click();
    }

    public void goToCheckOutClick() {
        goToCheckOut.click();
    }

    public void timeoutForPage() {
        webDriverWait.until(ExpectedConditions.numberOfElementsToBe(By.className("blockUI"), 0));

    }
}
