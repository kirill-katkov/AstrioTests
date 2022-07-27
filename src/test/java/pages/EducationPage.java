package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class EducationPage {
    SelenideElement
            navLinkVacancies = $x("(//nav//ul//li//a)[1]"),
            menuLinkEducation = $x("(//li[@class='careerMenu__item']//a)[3]"),
            menuEducationCheckTitle = $("div#progress .careerInfo__title"),
            menuEducationUCheckText = $("div#progress .careerInfo__text");

    public EducationPage openHomePage() {
        open("https://astrio.ru/");
        //zoom(0.5);
        return this;
    }

    public EducationPage openNavLinkVacancies() {
        navLinkVacancies.click();
        //zoom(0.5);
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
