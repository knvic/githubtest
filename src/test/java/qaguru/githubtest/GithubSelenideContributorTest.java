package qaguru.githubtest;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;

public class GithubSelenideContributorTest {

    @Test
    void githubSelenideContributorTest() {
       open("https://github.com/selenide/selenide");
       // открываем страницу
       // подводим мышку и видим окно
      // $(".Layout-sidebar").$(byText("Contributors")).closest(".BorderGrid-cell").$$("ul li").first().hover();
        $(".Layout-sidebar").$(byText("Contributors")).closest("h2").sibling(0)
                .$$("li").first().hover();
        $$(".Popover-message").findBy(Condition.visible); //находит все и ввыбирает какой видимый

        $(".Popover-message").shouldHave(text("Andrei Solntsev"));

        //  Длинный путь, используя методы показанные на занятии.
       // $("#wiki-body").$("div").$("h1").sibling(1).$$("li").first().sibling(5).$("a").click();

       sleep(10000);
    }
}
