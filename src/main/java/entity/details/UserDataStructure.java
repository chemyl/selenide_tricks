package entity.details;

import lombok.Data;
import uk.co.jemos.podam.common.PodamStringValue;

@Data
public class UserDataStructure {
    private String name;
    private String lastName;
    private int age;

    @PodamStringValue(strValue = "test/resources/example.txt")
    private String userImagePath;
}
