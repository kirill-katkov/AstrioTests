package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class AboutUsPage {

    SelenideElement
            navLinkVacancies = $x("(//nav//a)[1]"),
            scrollNavAboutUS = $(".careerBanner__point--point1 .careerBanner__pointCircle"),
            menuAboutUCheckTitle = $("div#about-us .careerInfo__title"),
            menuAboutUCheckText = $("div#about-us .careerInfo__text");

    public AboutUsPage openHomePage() {
        open("https://astrio.ru/");
        return this;
    }

    public AboutUsPage openNavLinkVacancies() {
        navLinkVacancies.click();
        return this;
    }

    public AboutUsPage openScrollNavAboutUS() {
        scrollNavAboutUS.click();
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
