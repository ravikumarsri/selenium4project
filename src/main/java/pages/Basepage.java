package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v105.runtime.model.WebDriverValue;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import utils.ConfigReader;


import java.time.Duration;



class BasePage {

    WebDriver driver;

public static  ThreadLocal <WebDriver> tlDriver = new ThreadLocal<>();
    public void initializeBrowser() {

        ConfigReader configReader = new ConfigReader();
        driver = null;

        switch (configReader.getBrowser()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                tlDriver.set(new ChromeDriver());
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                tlDriver.set(new FirefoxDriver());
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                tlDriver.set(new EdgeDriver());
                break;

            case "safari":
                WebDriverManager.safaridriver().setup();
                tlDriver.set(new SafariDriver());
                break;

        }
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Long.parseLong(configReader.getPageLoadTimeout())));
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(configReader.getImplicitlyWait())));
        getDriver().manage().window().maximize();
        getDriver().manage().deleteAllCookies();
    }
        public static WebDriver getDriver(){
        return tlDriver.get();
        }
       



    }


