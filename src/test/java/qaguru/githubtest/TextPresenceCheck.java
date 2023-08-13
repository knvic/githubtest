package qaguru.githubtest;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TextPresenceCheck {
    @Test
    void textPresenceCheck() {
        String codeJUnit5 = "@ExtendWith({SoftAssertsExtension.class})\n" +
                "class Tests {\n" +
                "  @Test\n" +
                "  void test() {\n" +
                "    Configuration.assertionMode = SOFT;\n" +
                "    open(\"page.html\");\n" +
                "\n" +
                "    $(\"#first\").should(visible).click();\n" +
                "    $(\"#second\").should(visible).click();\n" +
                "  }\n" +
                "}";
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".Box-row.wiki-more-pages-link").$("button[type=button]").click();
        $("#wiki-wrapper").shouldHave(text("SoftAssertions"));
        $(".Layout-sidebar").$(byText("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text(codeJUnit5));
    }
}
