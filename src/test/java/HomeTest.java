import common.BaseTest;
import methods.HomePageMethods;
import org.junit.jupiter.api.Test;

public class HomeTest extends BaseTest {

    @Test
    public void verifyKeyElementsAreDisplayedTest() {
        new HomePageMethods(getDriver()).verifyKeyElementsDisplayed();
    }

}
