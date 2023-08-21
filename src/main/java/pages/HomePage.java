package pages;

import entity.details.ComponentNames;

public class HomePage {

    private final ComponentPage componentPage;

    public HomePage() {
        this.componentPage = new ComponentPage();
    }

    public ComponentPage getComponentPage() {
        return componentPage;
    }

    public FirstComponentPage navigateToFirstComponentPage() {
        this.componentPage.chooseComponentItem(ComponentNames.COMPONENT_N1);
        return new FirstComponentPage();
    }
}
