package tests.demoqa;


import com.codeborne.selenide.Selenide;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AstrioPage;
import pages.HrPrimePage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.zoom;
import static io.qameta.allure.Allure.step;


@Owner("KirillKatkov")
@Feature("Задачи в репозитории")
@Story("Просмотр созданных задач в репозитории")
@Link(value = "Тестинг", url = "https://github.com")
public class HrPrimePageTests extends TestBase{
    AstrioPage astrioPage = new AstrioPage();
HrPrimePage hrPrimePage = new HrPrimePage();

    private final String mainPage = "https://hrprime.ru/";
    private final String casesPage = "https://hrprime.ru/cases";
    private final String clientPage = "https://hrprime.ru/client";
    private final String contactsPage = "https://hrprime.ru/contacts";
    private final String candidatePage = "https://hrprime.ru/candidate";




//    public HrPrimePage searchContactBlock() {
//        open(contactsPage);
//        contactBlock.scrollTo();
//        contactBlockCheckContent.shouldHave(text("Цветной бульвар 30с11"));
//        return this;
//    }
//
//    public HrPrimePage fillingForm() {
//        open(mainPage);
//        formBlock.click();
//        formName.setValue("Alex");
//        formPhone.setValue("9091982985");
//        formEmail.setValue("alexgarahov@gmail.com");
//        formCompany.setValue("Company");
//        formTextArea.setValue("Message");
//        formSubmit.click();
//        return this;
//    }
//
//    public HrPrimePage searchCandidateBlock() {
//        //поиск информации по вкладке кандидату
//        open(candidatePage);
//        zoom(0.8);
//        candidateBlock.scrollTo();
//        candidateBlockCheckContent.shouldHave(text("Мы работаем с лидерами рынка и выбираем самые топовые компании с наиболее интересным позициями."));
//        //Configuration.timeout = 4000;
//        return this;
//    }


    @Test
    @Tag("hrPrimePage")
    @DisplayName("Проверка открытия страницы и поиск заголовка на главной странице")
    void openAndCheckTitleTest() {
        step("Открытие страницы - https://hrprime.ru", () -> {
            hrPrimePage.openPage();
        });
        step("Поиск заголовка на главной странице", () -> {
            hrPrimePage.checkMainTitle();
        });
    }

    @Test
    @Tag("hrPrimePage")
    @DisplayName("Переход на вкладку Ozon")
    void openTabOzon() {
        step("Открытие страницы - https://hrprime.ru", () -> {
            hrPrimePage.openPage();
        });
        step("Переход на вкладку Ozon", () -> {
            hrPrimePage.scrollTabOzon();
        });
        step("Переход на вкладку Ozon", () -> {
            hrPrimePage.clickTabOzon();
        });
    }

    @Test
    @Tag("hrPrimePage")
    @DisplayName("Переход на вкладку Ozon и поиск контента по кейсу")
    void checkContentTabOzon() {
        step("Открытие страницы - https://hrprime.ru", () -> {
            hrPrimePage.openPage();
        });
        step("Переход на вкладку Ozon", () -> {
            hrPrimePage.clickTabOzon();
        });
        step("Поиск по вкладке Ozon", () -> {
            hrPrimePage.searchInTabOzon();
        });
    }


    @Test
    @Tag("hrPrimePage")
    @DisplayName("Переход на страницу кейсов и поиск контента в хорошем кейсе")
    void openAndCheckGoodСases() {
        step("Открытие страницы - https://hrprime.ru/cases", () -> {
            hrPrimePage.openPage(casesPage);
        });
        step("Поиск по хорошему кейсу - Ozon", () -> {
            hrPrimePage.searchGoodСasesOzon();
        });
    }


    @Test
    @Tag("hrPrimePage")
    @DisplayName("Переход на страницу кейсов и поиск контента в плохом кейсе")
    void openAndCheckBadСases() {
        step("Открытие страницы - https://hrprime.ru/cases", () -> {
            hrPrimePage.openPage(casesPage);
        });
        step("Поиск по плохому кейсу - Yandex", () -> {
            hrPrimePage.searchBadСasesYandex();
        });
    }

    @Test
    @Tag("hrPrimePage")
    @DisplayName("Переход на страницу специальностей и поиск заголовка")
    void openAndCheckBSpecialtyContent() {
        step("Открытие страницы - https://hrprime.ru/cases", () -> {
            hrPrimePage.openPage(clientPage);
        });
        step("Поиск заголовка - QA", () -> {
            hrPrimePage.searchSpecialtyBlock();
        });
    }
//
//
//
//    @Test
//    @Tag("astrio")
//    @DisplayName("Проверка меню на главной страницы")
//    void checkMainMenu() {
//        step("Открытие страницы - https://astrio.ru/", () -> {
//            astrioPage.openPage();
//        });
//
//        step("Проверка присутствия на странице пунктов меню - Вакансия, О нас, Клиенты, Услуги, Блог, Контакты", () -> {
//            astrioPage.checkResultMain("Вакансии")
//                    .checkResultMain("О нас")
//                    .checkResultMain("Клиенты")
//                    .checkResultMain("Услуги")
//                    .checkResultMain("Блог")
//                    .checkResultMain("Контакты");
//        });
//    }
//
//    @Test
//    @Tag("astrio")
//    @DisplayName("Открытие страницы вакансий и проверка меню")
//    void vacanciesOpenAndCheck() {
//        step("Открытие страницы - https://astrio.ru/", () -> {
//            astrioPage.openPage();
//        });
//        step("Открытие страницы Вакансий", () -> {
//            astrioPage.openNavLinkVacancies();
//        });
//
//        step("Проверка присутствия на странице пунктов меню - О нас, Что мы делаем, Обучение в Astrio, Ваша курьера, Стажировка и практика, Наши вакансии", () -> {
//            astrioPage.checkResultVacancies("О нас")
//                    .checkResultVacancies("Что мы делаем")
//                    .checkResultVacancies("Обучение в ASTRIO")
//                    .checkResultVacancies("Ваша карьера")
//                    .checkResultVacancies("Стажировка и практика")
//                    .checkResultVacancies("Наши вакансии");
//        });
//
//    }
//
//    @Test
//    @Tag("astrio")
//    @DisplayName("Переход к пунту меню - О нас и проверка контента")
//    void aboutUSOpenAndCheck() {
//        step("Открытие страницы - https://astrio.ru/", () -> {
//            astrioPage.openPage();
//        });
//        step("Открытие страницы Вакансий", () -> {
//            astrioPage.openNavLinkVacancies();
//        });
//
//        step("Переход к пункту меню о Нас", () -> {
//            astrioPage.openScrollNavAboutUS();
//        });
//
//        step("Проверка текста заголовка", () -> {
//            astrioPage.aboutUCheckTitle("Работа в одной из лучших IT компаний Ульяновска");
//        });
//
//        step("Проверка текста параграфа", () -> {
//            astrioPage.aboutUCheckText("Высокий уровень проектов,");
//        });
//    }
//
//    @Test
//    @Tag("astrio")
//    @DisplayName("Переход к пунту меню - Что мы делаем и проверка контакета")
//    void linkDoingOpenAndCheck() {
//        step("Открытие страницы - https://astrio.ru/", () -> {
//            astrioPage.openPage();
//        });
//        step("Открытие страницы Вакансий", () -> {
//            astrioPage.openNavLinkVacancies();
//        });
//        step("Переход к пункту меню - Что мы делаем", () -> {
//            astrioPage.openMenuLinkDoing();
//        });
//
//        step("Проверка текста заголовка", () -> {
//            astrioPage.doingCheckTitle("Наши проекты");
//        });
//
//        step("Проверка текста параграфа", () -> {
//            astrioPage.doingUCheckText("Наша основная платформа - Magento");
//        });
//    }
//
//
//    @Test
//    @Tag("astrio")
//    @DisplayName("Переход к пунту меню - Обучение и карьера и проверка контекста")
//    void linkEducationOpenAndCheck() {
//        step("Открытие страницы - https://astrio.ru/", () -> {
//            astrioPage.openPage();
//        });
//        step("Открытие страницы Вакансий", () -> {
//            astrioPage.openNavLinkVacancies();
//        });
//        step("Переход к пункту меню - Обучение и карьера", () -> {
//            astrioPage.openMenuLinkEducation();
//        });
//
//        step("Проверка текста заголовка", () -> {
//            astrioPage.educationCheckTitle("Отлаженный процесс обучения");
//        });
//
//        step("Проверка текста параграфа", () -> {
//            astrioPage.educationUCheckText("Наш процесс постоянно шлифуется последние 6 лет.");
//        });
//    }
//
//    @Test
//    @Tag("astrio")
//    @DisplayName("Заполнение формы для Старта в IT проверка отправки")
//    void setAndCheckLinkCareer() {
//        step("Открытие страницы - https://astrio.ru/", () -> {
//            astrioPage.openPage();
//        });
//        step("Открытие страницы Вакансий", () -> {
//            astrioPage.openNavLinkVacancies();
//        });
//        step("Переход к пункту меню - Ваша карьера", () -> {
//            astrioPage.openMenuLinkCareer();
//        });
//
//        step("Заполнение имени в форме", () -> {
//            astrioPage.setContactName("Ruslan");
//        });
//        step("Заполнение емайла  в форме", () -> {
//            astrioPage.setContactEmail("1ya-ruslan@gmail.com");
//        });
//        step("Заполнение телефона  в форме", () -> {
//            astrioPage.setContactPhone("790429445322");
//        });
//
//        step("Клик по кнопке - отправка формы", () -> {
//            astrioPage.careerButton();
//        });
//
//        step("Проверка заполнения формы", () -> {
//            Selenide.sleep(5000);
//            astrioPage.careerCheckForm("Ваше сообщение получено и мы ответим на него в ближайшее время. Спасибо за сообщение.");
//        });
//    }

}
