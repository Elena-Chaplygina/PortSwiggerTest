import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static io.qameta.allure.Allure.step;

public class BurpSuiteTest extends TestBase {


    @CsvSource({
            "[data-ga-click-label=products],[data-ga-click-label=feature-how-to-buy-burp-suite]",
            "[data-ga-click-label=solutions],[data-ga-click-label=feature-product-burp-comparison]",
            "[data-ga-click-label=support],[data-ga-click-label=feature-burp-software-downloads]"
    })
    @ParameterizedTest
    void menuOpensAfterClickingItemTest(String item, String img) {
        step("Menu opens after clicking item", () -> {
            burpSuitePage.menuOpensAfterClickingItem(item, img);
        });
    }

    @CsvSource({
            "[alt=FedEx]", "[alt=Amazon]", "[alt=Google]", "[alt=AXA]", "[alt=Barclays]"
    })
    @ParameterizedTest
    void hoverIconShouldBeBrighterTest(String alt) {
        step("Icon should be change css attribute after hover", () -> {

            burpSuitePage.hoverIconShouldBeBrighter(alt);
        });
    }

    @Test
    void hederPageTest() {
        step("Menu should be open after hover", () -> {
            burpSuitePage.gamburgerOpensAfterHoverItem();
        });

        step("After clicking on the button, go to the login form", () -> {
            burpSuitePage.afterClickOnButtonGoToLoginForm();
        });
    }

    @CsvSource({
            "[data-ga-click-label=research], href, https://portswigger.net/research",
            "[data-ga-click-label=academy], href, https://portswigger.net/web-security",
            "[data-ga-click-label=dailyswig], href, https://portswigger.net/daily-swig",
    })
    @ParameterizedTest
    void itemShouldHavelink(String item, String attribute, String url) {
        step("Item in the header must have a link", () -> {
            burpSuitePage.itemShouldHavelink(item, attribute, url);

        });
    }

}