package entity.details;

public enum ComponentNames {

    COMPONENT_N1("firstComponent"),
    COMPONENT_N2("secondComponent");

    private final String componentName;

    public String getComponentNames() {
        return componentName;
    }

    ComponentNames(String componentName) {
        this.componentName = componentName;
    }

}
