package config;

import org.aeonbits.owner.Config;

public interface WebDriverConfig extends Config {
    @Key("browser")
    @DefaultValue("chrome")
    String getBrowser();

    @Key("browserVersion")
    @DefaultValue("100.0")
    String getBrowserVersion();

    @Key("locale")
    @DefaultValue("locally")
    String getLocale();

}
