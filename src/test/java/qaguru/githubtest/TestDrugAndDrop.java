package qaguru.githubtest;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TestDrugAndDrop {

    @Test
    void testDrugAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").shouldHave(text("A"));
        $("#column-b").shouldHave(text("B"));
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));

    }

   /* //НЕ РАБОТАЕТ
   @Test
    void  testActionDrugAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        Selenide.sleep(500);
       // SelenideElement a = $$("column").first();
        SelenideElement a = $("#column-a");
        $("#column-a").hover();
        Selenide.sleep(2000);
        SelenideElement b = $("#column-b");
        actions().clickAndHold(b).moveToElement(a).release().build().perform();
       // actions().clickAndHold(a).moveByOffset(22,22).release(a).build().perform();
       $("#column-a").shouldHave(text("B"));
       $("#column-b").shouldHave(text("A"));
        Selenide.sleep(8000);
    }
*/


}

