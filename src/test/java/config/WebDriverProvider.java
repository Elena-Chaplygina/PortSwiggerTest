package config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

public class WebDriverProvider {


    private final WebDriverConfig config;


    public WebDriverProvider() {
        this.config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
    }

    public WebDriverProvider initConfig() {
        if (config.getLocale() == "remote" || config.getLocale() == null) {
            Configuration.remote = System.getProperty("url", "https://user1:1234@selenoid.autotests.cloud/wd/hub");
        }
        Configuration.browser = config.getBrowser();
        Configuration.browserVersion = config.getBrowserVersion();


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of("enableVNC", true, "enableVideo", true));

        Configuration.browserCapabilities = capabilities;


        Configuration.holdBrowserOpen = true;
        return null;
    }


}
