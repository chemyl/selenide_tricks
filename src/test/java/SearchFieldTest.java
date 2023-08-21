import base.TestSetup;
import entity.details.ComponentNames;
import entity.details.UserDataStructure;
import org.junit.jupiter.api.Test;
import pages.ComponentPage;
import pages.InitPage;
import testData.UserTestData;

class SearchFieldTest extends TestSetup {
    UserDataStructure userDataStructure = UserTestData.getUserDataStructure();

    @Test
    void testSearchMethod2() {
        InitPage.getInstance().searchSomething("MyText");
    }

    @Test
    void testSearchMethod3() {
        InitPage.getInstance().searchSomething("text")
                .getComponentPage()       //Transition to AnotherPage
                .chooseComponentItem(ComponentNames.COMPONENT_N1);
    }

    @Test
    void testSearchMethod4() {
        InitPage.getInstance().searchSomething("text")
                .getComponentPage()
                .chooseComponentItem(ComponentNames.COMPONENT_N2);
    }

    @Test
    void testSearchMethod5() {
        InitPage.getInstance()
                .searchSomething("text")
                .getComponentPage()
                .addImageToComponent(userDataStructure.getUserImagePath());
        ComponentPage.getInstance().addImageToComponent(userDataStructure.getUserImagePath());
    }

    @Test
    void testSearchMethod6() {
        InitPage.getInstance().searchSomething("text")
                .getComponentPage().addImageToComponent(userDataStructure.getUserImagePath());
        userDataStructure.setName("James");
        userDataStructure.setLastName("Smith");
        userDataStructure.setAge(11);

        ComponentPage.getInstance().addImageToComponent(userDataStructure.getUserImagePath());
    }

    @Test
    void testSearchMethod7() {
        InitPage.getInstance().searchSomething("text")
                .navigateToFirstComponentPage();
    }


}
