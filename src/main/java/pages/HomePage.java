package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(className = "header__logo-container")
    private WebElement logo;

    @FindBy(xpath = "//*[text()='Services']")
    private WebElement servicesTabButton;

    @FindBy(xpath = "//*[text()='Our Work']")
    private WebElement ourWorkTabButton;

    @FindBy(xpath = "//*[text()='How We Do It']")
    private WebElement howWeDoItTabButton;

    @FindBy(xpath = "//*[text()='Insights']")
    private WebElement insightsTabButton;

    @FindBy(xpath = "//*[text()='About']")
    private WebElement aboutTabButton;

    @FindBy(xpath = "//*[text()='Careers']")
    private WebElement careersTabButton;

    public WebElement getLogo() {
        return logo;
    }

    public WebElement getServicesTabButton() {
        return servicesTabButton;
    }

    public WebElement getOurWorkTabButton() {
        return ourWorkTabButton;
    }

    public WebElement getHowWeDoItTabButton() {
        return howWeDoItTabButton;
    }

    public WebElement getInsightsTabButton() {
        return insightsTabButton;
    }

    public WebElement getAboutTabButton() {
        return aboutTabButton;
    }

    public WebElement getCareersTabButton() {
        return careersTabButton;
    }

}
