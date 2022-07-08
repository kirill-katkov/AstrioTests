package tests.demoqa;


import com.codeborne.selenide.Selenide;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AstrioPage;


import static io.qameta.allure.Allure.step;



@Owner("KirillKatkov")
@Feature("Задачи в репозитории")
@Story("Просмотр созданных задач в репозитории")
@Link(value = "Тестинг", url = "https://github.com")
public class AstrioPageTests extends TestBase{
    AstrioPage astrioPage = new AstrioPage();

    @Test
    @Tag("astrio")
    @DisplayName("Проверка открытия страницы и поиск копирайта на главной странице")
    void checkCopyrightTest() {
        step("Открытие страницы - https://astrio.ru/", () -> {
            astrioPage.openPage();
        });
        step("Проверка копирайта - astrio", () -> {
            astrioPage.checkCopyright();
        });
    }



    @Test
    @Tag("astrio")
    @DisplayName("Открытие страницы вакансий и проверка копирайта")
    void vacanciesCopyrightTest() {
        step("Открытие страницы - https://astrio.ru/", () -> {
            astrioPage.openPage();
        });
        step("Открытие страницы Вакансий", () -> {
            astrioPage.openNavLinkVacancies();
        });
        step("Проверка копирайта - astrio", () -> {
            astrioPage.checkCopyright();
        });
    }




    @Test
    @Tag("astrio")
    @DisplayName("Проверка меню на главной страницы")
    void checkMainMenu() {
        step("Открытие страницы - https://astrio.ru/", () -> {
            astrioPage.openPage();
        });

        step("Проверка присутствия на странице пунктов меню - Вакансия, О нас, Клиенты, Услуги, Блог, Контакты", () -> {
            astrioPage.checkResultMain("Вакансии")
                    .checkResultMain("О нас")
                    .checkResultMain("Клиенты")
                    .checkResultMain("Услуги")
                    .checkResultMain("Блог")
                    .checkResultMain("Контакты");
        });
    }

    @Test
    @Tag("astrio")
    @DisplayName("Открытие страницы вакансий и проверка меню")
    void vacanciesOpenAndCheck() {
        step("Открытие страницы - https://astrio.ru/", () -> {
            astrioPage.openPage();
        });
        step("Открытие страницы Вакансий", () -> {
            astrioPage.openNavLinkVacancies();
        });

        step("Проверка присутствия на странице пунктов меню - О нас, Что мы делаем, Обучение в Astrio, Ваша курьера, Стажировка и практика, Наши вакансии", () -> {
            astrioPage.checkResultVacancies("О нас")
                    .checkResultVacancies("Что мы делаем")
                    .checkResultVacancies("Обучение в ASTRIO")
                    .checkResultVacancies("Ваша карьера")
                    .checkResultVacancies("Стажировка и практика")
                    .checkResultVacancies("Наши вакансии");
        });
    }

    @Test
    @Tag("astrio")
    @DisplayName("Переход к пунту меню - О нас и проверка контента")
    void aboutUSOpenAndCheck() {
        step("Открытие страницы - https://astrio.ru/", () -> {
            astrioPage.openPage();
        });
        step("Открытие страницы Вакансий", () -> {
            astrioPage.openNavLinkVacancies();
        });

        step("Переход к пункту меню о Нас", () -> {
            astrioPage.openScrollNavAboutUS();
        });

        step("Проверка текста заголовка", () -> {
            astrioPage.aboutUCheckTitle("Работа в одной из лучших IT-компаний Ульяновска");
        });

        step("Проверка текста параграфа", () -> {
            astrioPage.aboutUCheckText("Высокий уровень проектов,");
        });
    }

    @Test
    @Tag("astrio")
    @DisplayName("Переход к пунту меню - Что мы делаем и проверка контакета")
    void linkDoingOpenAndCheck() {
        step("Открытие страницы - https://astrio.ru/", () -> {
            astrioPage.openPage();
        });
        step("Открытие страницы Вакансий", () -> {
            astrioPage.openNavLinkVacancies();
        });
        step("Переход к пункту меню - Что мы делаем", () -> {
            astrioPage.openMenuLinkDoing();
        });

        step("Проверка текста заголовка", () -> {
            astrioPage.doingCheckTitle("Наши проекты");
        });

        step("Проверка текста параграфа", () -> {
            astrioPage.doingUCheckText("Наша основная платформа - Magento");
        });
    }


    @Test
    @Tag("astrio")
    @DisplayName("Переход к пунту меню - Обучение и карьера и проверка контекста")
    void linkEducationOpenAndCheck() {
        step("Открытие страницы - https://astrio.ru/", () -> {
            astrioPage.openPage();
        });
        step("Открытие страницы Вакансий", () -> {
            astrioPage.openNavLinkVacancies();
        });
        step("Переход к пункту меню - Обучение и карьера", () -> {
            astrioPage.openMenuLinkEducation();
        });

        step("Проверка текста заголовка", () -> {
            astrioPage.educationCheckTitle("Отлаженный процесс обучения");
        });

        step("Проверка текста параграфа", () -> {
            astrioPage.educationUCheckText("Наш процесс постоянно шлифуется последние 6 лет.");
        });
    }

    @Test
    @Tag("astrio")
    @DisplayName("Заполнение формы для Старта в IT проверка отправки")
    void setAndCheckLinkCareer() {
        step("Открытие страницы - https://astrio.ru/", () -> {
            astrioPage.openPage();
        });
        step("Открытие страницы Вакансий", () -> {
            astrioPage.openNavLinkVacancies();
        });
        step("Переход к пункту меню - Ваша карьера", () -> {
            astrioPage.openMenuLinkCareer();
        });

        step("Заполнение имени в форме", () -> {
            astrioPage.setContactName("Ruslan");
        });
        step("Заполнение емайла  в форме", () -> {
            astrioPage.setContactEmail("1ya-ruslan@gmail.com");
        });
        step("Заполнение телефона  в форме", () -> {
            astrioPage.setContactPhone("790429445322");
        });

        step("Клик по кнопке - отправка формы", () -> {
            astrioPage.careerButton();
            Selenide.sleep(10000);
        });

        step("Проверка заполнения формы", () -> {
            astrioPage.careerCheckForm("Ваше сообщение получено и мы ответим на него в ближайшее время. Спасибо за сообщение.");
        });
    }

}
