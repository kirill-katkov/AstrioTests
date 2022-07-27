package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class AboutUsPage {

    SelenideElement
            navLinkVacancies = $x("(//nav//ul//li//a)[1]"),
            scrollNavAboutUS = $(".careerBanner__point--point1 .careerBanner__pointCircle"),
            menuAboutUCheckTitle = $("div#about-us .careerInfo__title"),
            menuAboutUCheckText = $("div#about-us .careerInfo__text");

    public AboutUsPage openHomePage() {
        open("https://astrio.ru/");
        zoom(0.5);
        return this;
    }

    public AboutUsPage openNavLinkVacancies() {
        navLinkVacancies.click();
        zoom(0.5);
        return this;
    }

    public AboutUsPage openScrollNavAboutUS() {
        scrollNavAboutUS.click();
        zoom(0.5);
        return this;
    }

    public AboutUsPage aboutUCheckTitle(String key) {
        menuAboutUCheckTitle.shouldHave(text(key));
        return this;
    }

    public AboutUsPage aboutUCheckText(String key) {
        menuAboutUCheckText.shouldHave(text(key));
        return this;
    }
}
