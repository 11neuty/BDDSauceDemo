package org.example.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InventoryPage {
    public static WebDriver webDriver;

    public InventoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;

    }
    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement sortProduct;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
    private WebElement productSauceJacket;

    public void selectSortProduct(String text){
        Select select = new Select(sortProduct);
        select.selectByVisibleText(text);
    }
    public void clickProductSauceJacket(){
        productSauceJacket.click();
    }
}