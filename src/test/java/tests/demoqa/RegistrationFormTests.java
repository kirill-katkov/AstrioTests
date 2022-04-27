package tests.demoqa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Tag("demoqa")
public class RegistrationFormTests extends TestBase{
    @Test
    @DisplayName("Successful fill registration test")
    void fillFormTest() {
        step("Open registration form", () -> {
            open("/automation-practice-form");
            $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
            executeJavaScript("$('footer').remove()");
            executeJavaScript("$('#fixedban').remove()");
        });


        step("Fill registration form", () -> {
            $("#firstName").setValue("Kirill");
            $("#lastName").setValue("Katkov");
            $("#userEmail").setValue("kirillkatkov@gmail.com");
            $("#genterWrapper").$(byText("Male")).click();
            $("#userNumber").setValue("9041995985");
            $("#dateOfBirthInput").click();
            $(".react-datepicker__month-select").selectOption("November");
            $(".react-datepicker__year-select").selectOption("1995");
            $(".react-datepicker__day--015:not(.react-datepicker__day--outside-month)").click();
            $("#subjectsInput").setValue("Math").pressEnter();
            $("#hobbiesWrapper").$(byText("Sports")).click();
            $("#uploadPicture").uploadFromClasspath("img/test.png");
            $("#currentAddress").setValue("moskovskaya 55");
            $("#state").click();
            $("#stateCity-wrapper").$(byText("NCR")).click();
            $("#city").click();
            $("#stateCity-wrapper").$(byText("Delhi")).click();
            $("#submit").click();
        });


        step("Verify form data", () -> {
            $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
            $(".table-responsive").shouldHave(text("Kirill Katkov"),text("kirillkatkov@gmail.com"),text("Male"),text("9041995985"),
                    text("Date of Birth 15 November,1995"),
                    text("Math"),
                    text("Sports"),
                    text("img/test.png".substring(4)),
                    text("moskovskaya 55"),
                    text("NCR" + " " + "Delhi"));
        });
    }
}