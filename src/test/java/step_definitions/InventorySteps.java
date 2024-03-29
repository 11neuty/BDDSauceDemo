package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.PageObject.InventoryPage;
import org.example.PageObject.LoginPage;
import org.openqa.selenium.WebDriver;

public class InventorySteps {
    private final WebDriver driver = Hooks.driver;

    InventoryPage inventoryPage = new InventoryPage(driver);
    LoginPage loginPage = new LoginPage(driver);

    @When("User sort product by {string}")
    public void userSortProductBy(String text) {
        inventoryPage.selectSortProduct(text);
    }

    @And("User click add to cart item sauce labs fleece jacket")
    public void userClickAddToCartItemSauceLabsFleeceJacket() {
        inventoryPage.clickProductSauceJacket();
    }


    @And("User add to click button add to cart item {string}")
    public void userAddToClickButtonAddToCartItem(String item) {
        inventoryPage.clickAddToCartItem(item);
    }
}
