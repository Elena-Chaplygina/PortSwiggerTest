package config;

import com.codeborne.selenide.Config;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

public class WebDriverProvider {


    private final WebDriverConfig config;

    public WebDriverProvider() {
        this.config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
    }

    public WebDriverProvider initConfig() {

        Configuration.browser = config.getBrowser();
        Configuration.browserVersion = config.getBrowserVersion();
        if (config.getLocale()=="remote"){
            Configuration.remote = System.getProperty("url", "https://user1:1234@selenoid.autotests.cloud/wd/hub");
        }


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));

        Configuration.browserCapabilities = capabilities;


        Configuration.holdBrowserOpen = true;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        return null;
    }


}
