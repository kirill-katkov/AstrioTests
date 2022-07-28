package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.VacanciesPage;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Owner("KirillKatkov")
@Feature("Задачи в репозитории")
@Story("Просмотр созданных задач в репозитории")
@Link(value = "Тестинг", url = "https://github.com")
public class VacanciesPageTests extends TestBase {
    VacanciesPage vacanciesPage = new VacanciesPage();

    @Test
    @Tag("astrio")
    @DisplayName("Открытие страницы вакансий и проверка копирайта")
    void vacanciesCopyrightTest() {
        step("Открытие страницы - https://astrio.ru/", () -> {
            open("");
        });
        step("Открытие страницы Вакансий https://astrio.ru/career/", () -> {
            vacanciesPage.openNavLinkVacancies();
        });
        step("Проверка копирайта - astrio", () -> {
            vacanciesPage.checkCopyright();
        });
    }


    @Test
    @Tag("astrio")
    @DisplayName("Открытие страницы вакансий и проверка меню")
    void vacanciesOpenAndCheck() {
        step("Открытие страницы - https://astrio.ru/", () -> {
            open("");
        });
        step("Открытие страницы Вакансий", () -> {
            vacanciesPage.openNavLinkVacancies();
        });

        step("Проверка присутствия на странице пунктов меню - О нас, Что мы делаем, Обучение в Astrio, Ваша курьера, Стажировка и практика, Наши вакансии", () -> {
            vacanciesPage.checkResultVacancies("О нас")
                    .checkResultVacancies("Что мы делаем")
                    .checkResultVacancies("Обучение в ASTRIO")
                    .checkResultVacancies("Ваша карьера")
                    .checkResultVacancies("Стажировка и практика")
                    .checkResultVacancies("Наши вакансии");
        });
    }
}
