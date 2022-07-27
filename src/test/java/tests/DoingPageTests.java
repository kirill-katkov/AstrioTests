package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.DoingPage;

import static io.qameta.allure.Allure.step;

@Owner("KirillKatkov")
@Feature("Задачи в репозитории")
@Story("Просмотр созданных задач в репозитории")
@Link(value = "Тестинг", url = "https://github.com")
public class DoingPageTests extends TestBase {
    DoingPage aboutUsPage = new DoingPage();

    @Test
    @Tag("astrio")
    @DisplayName("Переход к пунту меню - Что мы делаем и проверка контакета")
    void linkDoingOpenAndCheck() {
        step("Открытие страницы - https://astrio.ru/", () -> {
            aboutUsPage.openHomePage();
        });
        step("Открытие страницы Вакансий", () -> {
            aboutUsPage.openNavLinkVacancies();
        });
        step("Переход к пункту меню - Что мы делаем", () -> {
            aboutUsPage.openMenuLinkDoing();
        });

        step("Проверка текста заголовка", () -> {
            aboutUsPage.doingCheckTitle("Наши проекты");
        });

        step("Проверка текста параграфа", () -> {
            aboutUsPage.doingUCheckText("Наша основная платформа - Magento");
        });
    }
}
