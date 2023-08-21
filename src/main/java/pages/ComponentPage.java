package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import entity.details.ComponentNames;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ComponentPage {

    public ComponentPage() {
    }

    public static ComponentPage getInstance() {
        return new ComponentPage();
    }

    private static final SelenideElement COMPONENT_ITEM = $x("//h3");

    public void chooseComponentItem(ComponentNames itemName) {
        $(byText(itemName.getComponentNames())).click();
    }


    public void addImageToComponent(String path) {
        COMPONENT_ITEM.shouldBe(Condition.visible, Condition.enabled).uploadFromClasspath(path);
    }
}
