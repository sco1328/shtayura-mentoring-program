package methods;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageMethods {
    private static final Logger LOGGER = LogManager.getLogger(BasePageMethods.class);
    private static final int TIMEOUT = 15;
    private static final int POLLING = 100;
    private WebDriver driver;
    private WebDriverWait wait;

    public BasePageMethods(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, TIMEOUT, POLLING);
    }

    public void waitForElementDisplayed(WebElement element) {
        LOGGER.info("Wait for element to be displayed");
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public boolean isElementDisplayed(WebElement element) {
        LOGGER.info("Verify element is displayed");
        return element.isDisplayed();
    }

    public void typeIntoField(WebElement element, String text) {
        LOGGER.info("Type text into field");
        waitForElementDisplayed(element);
        element.clear();
        element.sendKeys(text);
    }

    public void clickOnElement(WebElement element) {
        LOGGER.info("Click on element");
        waitForElementDisplayed(element);
        element.click();
    }

    public void scrollToElement(WebElement element) {
        LOGGER.info("Scroll to element");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public WebDriver getDriver() {
        return driver;
    }

}
