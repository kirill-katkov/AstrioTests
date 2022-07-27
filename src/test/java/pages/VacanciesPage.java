package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class VacanciesPage {

    SelenideElement
            navLinkVacancies = $x("(//nav//a)[1]"),
            practiceFormWrapper = $(".block-copyright"),
            linkMenuVacancies = $("ul.careerMenu__list");

    public VacanciesPage openHomePage() {
        open("https://astrio.ru/");
        return this;
    }

    public VacanciesPage openNavLinkVacancies() {
        navLinkVacancies.click();
        return this;
    }

    public VacanciesPage checkCopyright() {
        practiceFormWrapper.shouldHave(text("ASTRIO"));
        return this;
    }

    public VacanciesPage checkResultVacancies(String key) {
        linkMenuVacancies.shouldHave(text(key));
        return this;
    }
}
