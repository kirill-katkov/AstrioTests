package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class EducationPage {

    SelenideElement
            navLinkVacancies = $x("(//nav//a)[1]"),
            menuLinkEducation = $x("(//li[@class='careerMenu__item']//a)[3]"),
            menuEducationCheckTitle = $("div#progress .careerInfo__title"),
            menuEducationUCheckText = $("div#progress .careerInfo__text");

    public EducationPage openNavLinkVacancies() {
        navLinkVacancies.click();
        return this;
    }

    public EducationPage openMenuLinkEducation() {
        menuLinkEducation.click();
        return this;
    }

    public EducationPage educationCheckTitle(String key) {
        menuEducationCheckTitle.shouldHave(text(key));
        return this;
    }

    public EducationPage educationUCheckText(String key) {
        menuEducationUCheckText.shouldHave(text(key));
        return this;
    }
}
