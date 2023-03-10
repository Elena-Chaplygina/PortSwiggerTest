import config.WebDriverProvider;
import helpers.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.BurpSuitePage;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {


BurpSuitePage burpSuitePage=new BurpSuitePage();

    @BeforeAll
    static void beforeAll() {
        WebDriverProvider provider=new WebDriverProvider().initConfig();

    }

    @BeforeEach
    void beforeEach() {
        open("https://portswigger.net/");
    }
    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }

}
