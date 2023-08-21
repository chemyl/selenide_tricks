package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;

public class InitPage {

    private InitPage() {
    }

    public static InitPage getInstance() {
        return new InitPage();
    }

    private static final SelenideElement SEARCH_INPUT = $x("//textarea[@type='search']");

    private static final ElementsCollection SEARCH_ITEMS = $$("//textarea[@type='search']");

    public HomePage searchSomething(String login) {
        SEARCH_INPUT.shouldBe(visible).setValue(login).pressEnter();
        return Selenide.page(HomePage.class);              //Initialized web-elements from the page under the hood of engine;
    }

    public void collectionsOperation() {
        SEARCH_ITEMS.filter(Condition.attribute("attrName", "arrtValue")).get(0).click();

    }
}
