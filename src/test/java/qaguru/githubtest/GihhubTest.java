package qaguru.githubtest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.*;

import org.junit.jupiter.api.Test;

public class GihhubTest {

    @Test
    void gihhubTest() {
        Configuration.holdBrowserOpen = true;
        //  Configuration.browser = "chrome";
        /// Configuration.pageLoadStrategy = "eager";
        open("https://github.com");
        $("[placeholder='Search or jump to...']").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $$("div[data-testid=results-list]").first().$("a").click();
        $("#repository-container-header").shouldHave(Condition.text("selenide\n/\n selenide"));


        // ARRANGE  подготовка
        // ACT действие
        // ASSERT проверка


    }
}
