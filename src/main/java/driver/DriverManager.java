package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import utils.PropertyReader;

public class DriverManager {
    private WebDriver driver;
    private String driverType;

    public DriverManager() {
        driverType = PropertyReader.getValue("driverType");
    }

    public void createDriver() {
        switch (driverType) {
            case "firefox":
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                System.setProperty("webdriver.gecko.driver",
                        "src/main/resources/drivers/geckodriver.tar.gz");
                setDriver(new FirefoxDriver(firefoxOptions));
                driver.manage().window().maximize();
                break;
            case "chrome":
            default:
                ChromeOptions chromeOptions = new ChromeOptions();
                System.setProperty("webdriver.chrome.driver",
                        "src/main/resources/drivers/chromedriver");
                chromeOptions.addArguments("--start-maximized");
                setDriver(new ChromeDriver(chromeOptions));
                break;
        }
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public WebDriver getDriver() {
        if (driver == null) {
            createDriver();
        }
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

}
