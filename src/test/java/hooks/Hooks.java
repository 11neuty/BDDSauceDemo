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
//    public void openBrowser(){
//       // WebDriverManager.chromedriver().clearDriverCache().setup();
//        //fungsi untuk setup chrome agar bisa terbuka
////        Object DesiredCapabilities = null;
////        WebDriver driver = new RemoteWebDriver(new DocFlavor.URL("http://localhost:4444/wd/hub"), DesiredCapabilities.clone());
//
//        WebDriverManager.chromedriver().clearDriverCache().setup();
//        ChromeOptions co = new ChromeOptions();
//        co.setBrowserVersion("122.0.6261.129");
//        co.addArguments("--remote-allow-origins=*");
//        co.addArguments("--disable-dev-shm-usage");
//        co.addArguments("--remote-debugging-port=9222");
//        co.setExperimentalOption("useAutomationExtension", false);
//        co.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
//        //inisiasi library selenium
//        driver = new ChromeDriver(co);
//
//
//
//        String appUrl = "https://www.saucedemo.com/";
//        driver.get(appUrl);//fungsi untuk ngebuka link html
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().window().maximize();//fungsi untuk memaximize browser
//    }

    public static void main(String[] args) throws MalformedURLException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Ryand/Downloads/chromedriver_win32/chromedriver.exe");


        WebDriver driver = new RemoteWebDriver(

                new URL("http://192.168.56.1:9515"),

                new ChromeOptions());

        String appUrl = "https://www.saucedemo.com/";
        driver.get(appUrl);//fungsi untuk ngebuka link html
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();//fungsi untuk memaximize browser



    }

    @After
    public void closeBrowser(){
        driver.quit();
    }
}
