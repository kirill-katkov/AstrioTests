package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class VacanciesPage {

    SelenideElement
            navLinkVacancies = $x("(//nav//ul//li//a)[1]"),
            practiceFormWrapper = $(".block-copyright"),
            linkMenuVacancies = $("ul.careerMenu__list");

    public VacanciesPage openHomePage() {
        open("https://astrio.ru/");
        //zoom(0.5);
        return this;
    }

    public VacanciesPage openNavLinkVacancies() {
        navLinkVacancies.click();
        //zoom(0.5);
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
