package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.print.DocFlavor;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void openBrowser(){
        WebDriverManager.chromedriver().clearDriverCache().setup();
        //fungsi untuk setup chrome agar bisa terbuka
        WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        //inisiasi library selenium
        driver = new ChromeDriver(co);

        String appUrl = "https://www.saucedemo.com/";
        driver.get(appUrl);//fungsi untuk ngebuka link html
        driver.manage().window().maximize();
    }

    @After
    public void closeBrowser(){
        driver.quit();
    }
}
