package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.EducationPage;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Owner("KirillKatkov")
@Feature("Задачи в репозитории")
@Story("Просмотр созданных задач в репозитории")
@Link(value = "Тестинг", url = "https://github.com")
public class EducationPageTests extends TestBase{
    EducationPage educationPage = new EducationPage();

    @Test
    @Tag("astrio")
    @DisplayName("Переход к пунту меню - Обучение и карьера и проверка контекста")
    void linkEducationOpenAndCheck() {
        step("Открытие страницы - https://astrio.ru/", () -> {
            open("");
        });
        step("Открытие страницы Вакансий", () -> {
            educationPage.openNavLinkVacancies();
        });
        step("Переход к пункту меню - Обучение и карьера", () -> {
            educationPage.openMenuLinkEducation();
        });

        step("Проверка текста заголовка", () -> {
            educationPage.educationCheckTitle("Отлаженный процесс обучения");
        });

        step("Проверка текста параграфа", () -> {
            educationPage.educationUCheckText("Наш процесс постоянно шлифуется последние 6 лет.");
        });
    }
}
