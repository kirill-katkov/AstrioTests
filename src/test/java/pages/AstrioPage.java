package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class AstrioPage {

    SelenideElement
            navLinkVacancies = $x("(//nav//ul//li//a)[1]"),
            navLinkAboutUs = $x("(//nav//ul//li//a)[2]"),
            navLinkClients = $x("(//nav//ul//li//a)[3]"),
            navLinkServices = $x("(//nav//ul//li//a)[4]"),
            navLinkBlog = $x("(//nav//ul//li//a)[5]"),
            navLinkContacts = $x("(//nav//ul//li//a)[6]"),

    scrollNavAboutUS = $(".careerBanner__point--point1 .careerBanner__pointCircle"),

    menuLinkAboutUs = $x("(//li[@class='careerMenu__item']//a)[1]"),//about Us
    menuLinkDoing=$x("(//li[@class='careerMenu__item']//a)[2]"),//what are we doing
    menuLinkEducation= $x("(//li[@class='careerMenu__item']//a)[3]"), //education
           menuLinkCareer = $x("(//li[@class='careerMenu__item']//a)[4]"), //career
            menuLinkPractice= $x("(//li[@class='careerMenu__item']//a)[5]"), //practice
            menuLinkVacancies = $x("(//li[@class='careerMenu__item']//a)[6]"), //vacancies

    menuAboutUCheckTitle =  $("div#about-us .careerInfo__title"),
            menuAboutUCheckText=$("div#about-us .careerInfo__text"),

    menuDoingCheckTitle =  $("div#what-we-do .careerInfo__title"),
            menuDoingUCheckText=$("div#what-we-do .careerInfo__text"),

    menuEducationCheckTitle =  $("div#progress .careerInfo__title"),
            menuEducationUCheckText=$("div#progress .careerInfo__text"),

    contactName= $("#short-contacts-name"),
    contactEmail= $("#short-contacts-email"),
    contactPhone=$("#short-contacts-phone"),
    contactSubmit=$(".shortContacts__submit"),
            contactMessage= $("#short-contacts-form .shortContacts__message"),
            linkMenuMain = $(".block-top-menu"),//на главной странице
            linkMenuVacancies = $("ul.careerMenu__list"),//на странице вакансий
            practiceFormWrapper = $(".block-copyright");

    public AstrioPage openPage() {
        open("https://astrio.ru/");
        zoom(0.5);
        return this;
    }

    public AstrioPage checkCopyright() {
        practiceFormWrapper.shouldHave(text("ASTRIO"));
        return this;
    }

    public AstrioPage checkResultMain(String key) {
        linkMenuMain.shouldHave(text(key));
        return this;
    }

    public AstrioPage checkResultVacancies(String key) {
        linkMenuVacancies.shouldHave(text(key));
        return this;
    }

    public AstrioPage openNavLinkVacancies() {
        navLinkVacancies.click();
        zoom(0.5);
        return this;
    }

    public AstrioPage openScrollNavAboutUS() {
        scrollNavAboutUS.click();
        zoom(0.5);
        return this;
    }

    public AstrioPage aboutUCheckTitle(String key) {
        menuAboutUCheckTitle.shouldHave(text(key));
        return this;
    }

    public AstrioPage aboutUCheckText(String key) {
        menuAboutUCheckText.shouldHave(text(key));
        return this;
    }


    public AstrioPage doingCheckTitle(String key) {
        menuDoingCheckTitle.shouldHave(text(key));
        return this;
    }

    public AstrioPage doingUCheckText(String key) {
        menuDoingUCheckText.shouldHave(text(key));
        return this;
    }

    public AstrioPage educationCheckTitle(String key) {
        menuEducationCheckTitle.shouldHave(text(key));
        return this;
    }

    public AstrioPage educationUCheckText(String key) {
        menuEducationUCheckText.shouldHave(text(key));
        return this;
    }


    public AstrioPage openMenuLinkDoing() {
        menuLinkDoing.click();
        return this;
    }
    public AstrioPage openMenuLinkEducation() {
        menuLinkEducation.click();
        return this;
    }


    public AstrioPage openMenuLinkCareer() {
        menuLinkCareer.click();
        return this;
    }

    public AstrioPage setContactName(String formContactName) {
        contactName.setValue(formContactName);
        return this;
    }

    public AstrioPage setContactEmail(String formContactEmail) {
        contactEmail.setValue(formContactEmail);
        return this;
    }

    public AstrioPage setContactPhone(String formContactPhone) {
        contactPhone.setValue(formContactPhone);
        return this;
    }

    public AstrioPage careerButton() {
        contactSubmit.click();
        return this;
    }

    public AstrioPage careerCheckForm(String key) {
        contactMessage.shouldHave(text(key));
        return this;
    }




}
