package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Owner("KirillKatkov")
@Feature("Задачи в репозитории")
@Story("Просмотр созданных задач в репозитории")
@Link(value = "Тестинг", url = "https://github.com")
public class MainPageTests extends TestBase {
    MainPage mainPage = new MainPage();

    @Test
    @Tag("astrio")
    @DisplayName("Проверка открытия страницы и поиск копирайта на главной странице")
    void mainCopyrightTest() {
        step("Открытие страницы - https://astrio.ru/", () -> {
            open("");
        });
        step("Проверка копирайта - astrio", () -> {
            mainPage.checkCopyright();
        });
    }

    @Test
    @Tag("astrio")
    @DisplayName("Проверка меню на главной страницы")
    void checkMainMenu() {
        step("Открытие страницы - https://astrio.ru/", () -> {
            open("");
        });
        step("Проверка присутствия на странице пунктов меню - Вакансия, О нас, Клиенты, Услуги, Блог, Контакты", () -> {
            mainPage.checkResultMain("Вакансии")
                    .checkResultMain("О нас")
                    .checkResultMain("Клиенты")
                    .checkResultMain("Услуги")
                    .checkResultMain("Блог")
                    .checkResultMain("Контакты");
        });
    }
}
