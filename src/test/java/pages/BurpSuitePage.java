package pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class BurpSuitePage {

    SelenideElement humburger = $(".hamburger-menu-desktop"),
            humburgerMenu = $(".hamburger-menu-desktop div"),
            loginButton = $(".login-buttons"),
            loginBanner = $(".banner-container.orange-banner-map-top"),
            loginForm = $("#FormContainer");


    @BeforeEach
    void beforeEach() {
        open("https://portswigger.net/");
    }

    public void menuOpensAfterClickingItem(String item, String img) {

        $(item).click();
        $(img).shouldBe(visible);

    }

    public void hoverIconShouldBeBrighter(String alt) {
        $(alt).hover().shouldHave(cssValue("filter", "none"));

    }

    public void gamburgerOpensAfterHoverItem() {
        humburger.hover();
        humburgerMenu.shouldBe(visible);
    }


    public void afterClickOnButtonGoToLoginForm() {
        loginButton.click();
        loginBanner.shouldHave(text("Login"));
        loginForm.shouldBe(visible);
        webdriver().shouldHave(url("https://portswigger.net/users"));

    }



    public void itemShouldHavelink(String item, String attribute, String url) {
        $(item).shouldHave((attribute(attribute, url)));
    }

}
