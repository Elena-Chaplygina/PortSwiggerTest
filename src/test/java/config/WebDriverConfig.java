package config;

import org.aeonbits.owner.Config;


@Config.Sources({
        "classpath:${env}.properties",
//        "classpath:locale.properties"

})

public interface WebDriverConfig extends Config {
    @Key("browser")
    @DefaultValue("FIREFOX")
    String getBrowser();

    @Key("browserVersion")
    @DefaultValue("98.0")
    String getBrowserVersion();


    @Key("remoteUrl")
    String getRemoteUrl();


}
