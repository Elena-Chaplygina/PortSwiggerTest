import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static io.qameta.allure.Allure.step;

public class BurpSuiteTest extends TestBase {


    @CsvSource({
            "[data-ga-click-label=products],[data-ga-click-label=feature-how-to-buy-burp-suite], Products",
            "[data-ga-click-label=solutions],[data-ga-click-label=feature-product-burp-comparison], Solutions",
            "[data-ga-click-label=support],[data-ga-click-label=feature-burp-software-downloads], Support"
    })
    @ParameterizedTest(name = "After click item {2} should be open dropdawn with img ")
    void menuOpensAfterClickingItemTest(String item, String img, String name) {
        step("Menu opens after clicking item", () -> {
            burpSuitePage.menuOpensAfterClickingItem(item, img);
        });
    }

    @CsvSource({
            "[alt=FedEx],FedEx", "[alt=Amazon], Amazon", "[alt=Google], Google", "[alt=AXA], AXA", "[alt=Barclays], Barclays"
    })
    @ParameterizedTest(name = "When hover over the icon {1}, the logo {1} becomes brighter")
    void hoverIconShouldBeBrighterTest(String alt, String name) {
        step("Icon should be change css attribute after hover", () -> {

            burpSuitePage.hoverIconShouldBeBrighter(alt);
        });
    }

    @Test
    @DisplayName("Checking the gamburger button and login")
    void hederPageTest() {
        step("Menu should be open after hover", () -> {
            burpSuitePage.gamburgerOpensAfterHoverItem();
        });

        step("After clicking on the button, go to the login form", () -> {
            burpSuitePage.afterClickOnButtonGoToLoginForm();
        });
    }

    @CsvSource({
            "[data-ga-click-label=research], href, https://portswigger.net/research, Research",
            "[data-ga-click-label=academy], href, https://portswigger.net/web-security, Academy",
            "[data-ga-click-label=dailyswig], href, https://portswigger.net/daily-swig, Daily swig",
    })
    @ParameterizedTest (name = "Checking that button {3} in the page header have link {2}")
    void itemShouldHavelink(String item, String attribute, String url, String name) {
        step("Item in the header must have a link", () -> {
            burpSuitePage.itemShouldHavelink(item, attribute, url);

        });
    }

}