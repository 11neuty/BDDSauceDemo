package org.example.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver webDriver;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;

    }
    //set up locator
    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement fieldUserName;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement fieldPassword;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement buttonLogin;

    @FindBy(xpath = "//span[@class='title']")
    private WebElement labelProduct;

    public void inputFieldUserName(String userName){
        fieldUserName.sendKeys(userName);
    }
    public void inputFieldPassword(String password){
        fieldPassword.sendKeys(password);
    }
    public void clickButtonLogin(){
        buttonLogin.click();
    }
    public boolean verifiyLabelProduct(){
        return labelProduct.isDisplayed();
    }
}