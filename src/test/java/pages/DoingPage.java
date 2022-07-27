package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DoingPage {

    SelenideElement
            navLinkVacancies = $x("(//nav//ul//li//a)[1]"),
            menuLinkDoing = $x("(//li[@class='careerMenu__item']//a)[2]"),
            menuDoingCheckTitle = $("div#what-we-do .careerInfo__title"),
            menuDoingUCheckText = $("div#what-we-do .careerInfo__text");

    public DoingPage openHomePage() {
        open("https://astrio.ru/");
        zoom(0.5);
        return this;
    }

    public DoingPage openNavLinkVacancies() {
        navLinkVacancies.click();
        zoom(0.5);
        return this;
    }

    public DoingPage openMenuLinkDoing() {
        menuLinkDoing.click();
        return this;
    }

    public DoingPage doingCheckTitle(String key) {
        menuDoingCheckTitle.shouldHave(text(key));
        return this;
    }

    public DoingPage doingUCheckText(String key) {
        menuDoingUCheckText.shouldHave(text(key));
        return this;
    }
}
