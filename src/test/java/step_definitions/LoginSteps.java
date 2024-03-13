package step_definitions;

import hooks.Hooks;
import org.example.PageObject.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private final WebDriver driver = Hooks.driver;
    LoginPage loginPage = new LoginPage(driver);

}
