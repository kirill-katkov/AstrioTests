package tests;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.CareerPage;

import static io.qameta.allure.Allure.step;

@Owner("KirillKatkov")
@Feature("Задачи в репозитории")
@Story("Просмотр созданных задач в репозитории")
@Link(value = "Тестинг", url = "https://github.com")
public class CareerPageTests extends TestBase{

    CareerPage careerPage = new CareerPage();

    @Test
    @Tag("astrio")
    @DisplayName("Заполнение формы для Старта в IT проверка отправки")
    void setAndCheckLinkCareer() {
        step("Открытие страницы - https://astrio.ru/", () -> {
            careerPage.openHomePage();
        });
        step("Открытие страницы Вакансий", () -> {
            careerPage.openNavLinkVacancies();
        });
        step("Переход к пункту меню - Ваша карьера", () -> {
            careerPage.openMenuLinkCareer();
        });

        step("Заполнение имени в форме", () -> {
            careerPage.setContactName("Ruslan");
        });
        step("Заполнение емайла  в форме", () -> {
            careerPage.setContactEmail("1ya-ruslan@gmail.com");
        });
        step("Заполнение телефона  в форме", () -> {
            careerPage.setContactPhone("790429445322");
        });

        step("Клик по кнопке - отправка формы", () -> {
            careerPage.careerButton();
            Selenide.sleep(10000);
        });

        step("Проверка заполнения формы", () -> {
            careerPage.careerCheckForm("Ваше сообщение получено и мы ответим на него в ближайшее время. Спасибо за сообщение.");
        });
    }
}
