package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HrPrimePage {

    private final String mainPage = "https://hrprime.ru";
    private final String casesPage = "https://hrprime.ru/cases";
    private final String clientPage = "https://hrprime.ru/client";
    private final String contactsPage = "https://hrprime.ru/contacts";
    private final String candidatePage = "https://hrprime.ru/candidate";

    SelenideElement
            mainTitle = $x("//div[@field='tn_text_1617596616062']"), //Создаем технологических лидеров"))
            topCasesBlock = $("div.t395"),
            ozonBlock = $x("//div[@field='title2']"),
            ozonBlockCheckContent = $x("//div[@field='tn_text_1617597766329']"),//Так как OZON активно проработал открытые источники поиска";

    goodCasesBlock = $("div.t959__row"), //.scrollTo();
            goodCaseOzon = $x("(//div[@class='t959__row']//div/a)[4]"), //.click();
            goodCaseOzonCheckContent = $("div#rec301167598"),//"Крупнейшему e-commerce ритейлеру России нужна")

    badCasesBlock = $("div#rec300221028"),
            badCaseYandex = $x("(//div[@id='rec300221028']//div[@class='t959__row']//div/a)[1]"),
            badCaseYandexCheckContent = $("div#rec300223214"),

    specialtyBlock = $("div#rec300089648"),
            specialtyBlockCheckContent = $x("(//div[@id='rec300089648']//div[@class='tn-atom'])[1]"),

    contactBlock = $("div#rec301090879"),
            contactBlockCheckContent = $x("(//div[@id='rec301090879']//div[@class='tn-atom'])[2]"),

    formBlock = $("div.t228__right_buttons_but a"), //$("div.t-input-block a").click();
            formName = $x("//input[@name='Name']"),
            formPhone = $x("//input[@name='Phone']"),
            formEmail = $x("//input[@name='Email']"),
            formCompany = $x("//input[@name='company']"),
            formTextArea = $x("//textarea[@placeholder='Любые уточнения']"),
            formSubmit = $("div.t-form__submit button"),

    candidateBlock = $("div.t795"),
            candidateBlockCheckContent = $("div.t005");


    public HrPrimePage openPage(String page) {
        open(page);
        return this;
    }

    public HrPrimePage checkMainTitle() {
        mainTitle.shouldHave(text("Создаем технологических лидеров"));
        return this;
    }

    public HrPrimePage scrollTabOzon() {
        topCasesBlock.scrollTo();
        return this;
    }


    public HrPrimePage clickTabOzon() {
        ozonBlock.click();
        return this;
    }

    public HrPrimePage searchInTabOzon() {
        ozonBlockCheckContent.shouldHave(text("Так как OZON активно проработал открытые источники поиска"));
        return this;
    }

    public HrPrimePage searchGoodСasesOzon() {
        goodCasesBlock.scrollTo();
        goodCaseOzon.click();
        goodCaseOzonCheckContent.shouldHave(text("Крупнейшему e-commerce ритейлеру России нужна"));
        return this;
    }


    public HrPrimePage searchBadСasesYandex() {
        badCasesBlock.scrollTo();
        badCaseYandex.click();
        badCaseYandexCheckContent.shouldHave(text("За время работы с компанией Яндекс с октября 2020 года по январь 2021 года было представлено 114"));
        return this;
    }

    public HrPrimePage searchSpecialtyBlock() {
        open(clientPage);
        specialtyBlock.scrollTo();
        specialtyBlockCheckContent.shouldHave(text("QA"));
        return this;
    }

    public HrPrimePage searchContactBlock() {
        open(contactsPage);
        contactBlock.scrollTo();
        contactBlockCheckContent.shouldHave(text("Цветной бульвар 30с11"));
        return this;
    }

    public HrPrimePage fillingForm() {
        open(mainPage);
        formBlock.click();
        formName.setValue("Alex");
        formPhone.setValue("9091982985");
        formEmail.setValue("alexgarahov@gmail.com");
        formCompany.setValue("Company");
        formTextArea.setValue("Message");
        formSubmit.click();
        return this;
    }

    public HrPrimePage searchCandidateBlock() {
        //поиск информации по вкладке кандидату
        open(candidatePage);
        zoom(0.8);
        candidateBlock.scrollTo();
        candidateBlockCheckContent.shouldHave(text("Мы работаем с лидерами рынка и выбираем самые топовые компании с наиболее интересным позициями."));
        //Configuration.timeout = 4000;
        return this;
    }


}


