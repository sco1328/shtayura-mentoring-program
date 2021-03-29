package common;

import driver.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    private static final Logger LOGGER = LogManager.getLogger(BaseTest.class);
    private static DriverManager driverManager;
    private WebDriver driver;

    @BeforeAll
    public static void createDriverManager() {
        LOGGER.info("Create driver manager");
        driverManager = new DriverManager();
    }

    @BeforeEach
    public void createDriver() {
        LOGGER.info("Create driver");
        driver = driverManager.getDriver();
    }

    @AfterAll
    public static void quit() {
        LOGGER.info("Quit driver");
        driverManager.quitDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

}
