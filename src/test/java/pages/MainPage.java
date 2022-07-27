package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    SelenideElement
            practiceFormWrapper = $(".block-copyright"),
            linkMenuMain = $(".block-top-menu");

    public MainPage openHomePage() {
        open("https://astrio.ru/");
        zoom(0.5);
        return this;
    }

    public MainPage checkCopyright() {
        practiceFormWrapper.shouldHave(text("ASTRIO"));
        return this;
    }

    public MainPage checkResultMain(String key) {
        linkMenuMain.shouldHave(text(key));
        return this;
    }
}
