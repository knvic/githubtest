package qaguru.githubtest;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestGithubHover {
    @Test
    void testGithubHover() {
        open("https://github.com");
        $(".header-menu-wrapper").$(byText("Solutions")).hover();
        $(".header-menu-wrapper").$(byText("Enterprise")).click();
        $(".application-main h1").shouldHave(text("Build like the best"));
    }
}
