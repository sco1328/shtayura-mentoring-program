package methods;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import utils.PropertyReader;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageMethods extends BasePageMethods {
    private static final Logger LOGGER = LogManager.getLogger(HomePageMethods.class);
    private HomePage homePage = PageFactory.initElements(getDriver(), HomePage.class);

    public HomePageMethods(WebDriver driver) {
        super(driver);
        String url = PropertyReader.getValue("url");
        LOGGER.info("Navigate to: {}", url);
        driver.get(url);
    }

    public void verifyKeyElementsDisplayed() {
        LOGGER.info("Verify key elements are displayed");
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(isElementDisplayed(homePage.getLogo())).isTrue();
//        softAssertions.assertThat(isElementDisplayed(homePage.getServicesTabButton())).isTrue();
//        softAssertions.assertThat(isElementDisplayed(homePage.getOurWorkTabButton())).isTrue();
//        softAssertions.assertThat(isElementDisplayed(homePage.getHowWeDoItTabButton())).isTrue();
//        softAssertions.assertThat(isElementDisplayed(homePage.getInsightsTabButton())).isTrue();
//        softAssertions.assertThat(isElementDisplayed(homePage.getAboutTabButton())).isTrue();
//        softAssertions.assertThat(isElementDisplayed(homePage.getCareersTabButton())).isTrue();
        softAssertions.assertAll();
    }

}
