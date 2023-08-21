package testData;

import entity.details.UserDataStructure;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public final class UserTestData {

    private static final PodamFactory FACTORY = new PodamFactoryImpl();

    private UserTestData() {
    }

    public static UserDataStructure getUserDataStructure() {
        return FACTORY.manufacturePojo(UserDataStructure.class);
    }
}
