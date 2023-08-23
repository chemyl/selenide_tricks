package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selectors.byValue;
import static com.codeborne.selenide.Selectors.withTextCaseInsensitive;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FirstComponentPage {

    private static final ElementsCollection SUBMIT_BUTTON = $$(Selectors.byTagAndText("button", "submit"));
    private static final SelenideElement SUBMIT_BUTTON_2 = $(byText("some_text"));
    private static final SelenideElement SUBMIT_BUTTON_3 = $(byTagAndText("button", "submit"), 0);
    private static final SelenideElement SUBMIT_BUTTON_4 = $(byTitle("title-value"));
    private static final SelenideElement SUBMIT_BUTTON_5 = $(byAttribute("attrName", "attrValue"));
    private static final SelenideElement SUBMIT_BUTTON_6 = $(byValue("value123"));
    private static final SelenideElement SUBMIT_BUTTON_7 = $(withTextCaseInsensitive("some_text"));
}
