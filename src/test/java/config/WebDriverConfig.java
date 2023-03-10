package config;

import org.aeonbits.owner.Config;


@Config.Sources({
//        "classpath:${locale}.properties",
        "classpath:remote.properties"
})

public interface WebDriverConfig extends Config {
    @Key("browser")
    @DefaultValue("firefox")
    String getBrowser();

    @Key("browserVersion")
    @DefaultValue("100.0")
    String getBrowserVersion();

    @Key("locale")
    @DefaultValue("locale")
    String getLocale();

    @Key("remote.url")
    String getBaseUrl();


}
