package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class CareerPage {

    SelenideElement
            navLinkVacancies = $x("(//nav//a)[1]"),
            menuLinkCareer = $x("(//li[@class='careerMenu__item']//a)[4]"),
            contactName = $("#short-contacts-name"),
            contactEmail = $("#short-contacts-email"),
            contactPhone = $("#short-contacts-phone"),
            contactSubmit = $(".shortContacts__submit"),
            contactMessage = $("#short-contacts-form .shortContacts__message");

    public CareerPage openHomePage() {
        open("https://astrio.ru/");
        return this;
    }

    public CareerPage openNavLinkVacancies() {
        navLinkVacancies.click();
        zoom(0.5);
        return this;
    }

    public CareerPage openMenuLinkCareer() {
        menuLinkCareer.click();
        return this;
    }

    public CareerPage setContactName(String formContactName) {
        contactName.setValue(formContactName);
        return this;
    }

    public CareerPage setContactEmail(String formContactEmail) {
        contactEmail.setValue(formContactEmail);
        return this;
    }

    public CareerPage setContactPhone(String formContactPhone) {
        contactPhone.setValue(formContactPhone);
        return this;
    }

    public CareerPage careerButton() {
        contactSubmit.click();
        return this;
    }

    public CareerPage careerCheckForm(String key) {
        contactMessage.shouldHave(text(key));
        return this;
    }
}
