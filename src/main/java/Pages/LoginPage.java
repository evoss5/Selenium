package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasicPage{

    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;


    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public LoginPage typeIntoUserNameField(String username){
        wait.until(ExpectedConditions.visibilityOf(usernameField));
        usernameField.sendKeys(username);
        return new LoginPage(driver);
    }

    public LoginPage typeIntoPasswordField(String password){
        wait.until(ExpectedConditions.visibilityOf(passwordField));
        passwordField.sendKeys(password);
        return new LoginPage(driver);
    }

    public void clickOnLoginButton(){
        WebElement signOnButton = driver.findElement(By.name("signon"));
        signOnButton.click();
    }

    public String getWarningMessage(){
        WebElement messageLabel = driver.findElement(By.cssSelector("#Content ul[class='messages'] li"));
        String warningText = messageLabel.getText();
        return warningText;
    }

}

