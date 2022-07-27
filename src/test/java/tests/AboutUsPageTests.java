package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AboutUsPage;

import static io.qameta.allure.Allure.step;

@Owner("KirillKatkov")
@Feature("Задачи в репозитории")
@Story("Просмотр созданных задач в репозитории")
@Link(value = "Тестинг", url = "https://github.com")
public class AboutUsPageTests extends TestBase {

    AboutUsPage aboutUsPage = new AboutUsPage();

    @Test
    @Tag("astrio")
    @DisplayName("Переход к пунту меню - О нас и проверка контента")
    void aboutUSOpenAndCheck() {
        step("Открытие страницы - https://astrio.ru/", () -> {
            aboutUsPage.openHomePage();
        });
        step("Открытие страницы Вакансий", () -> {
            aboutUsPage.openNavLinkVacancies();
        });

        step("Переход к пункту меню о Нас", () -> {
            aboutUsPage.openScrollNavAboutUS();
        });

        step("Проверка текста заголовка", () -> {
            aboutUsPage.aboutUCheckTitle("Работа в одной из лучших IT-компаний Ульяновска");
        });

        step("Проверка текста параграфа", () -> {
            aboutUsPage.aboutUCheckText("Высокий уровень проектов,");
        });
    }
}
