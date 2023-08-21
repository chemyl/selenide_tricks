package base;

import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Selenide.open;

@ExtendWith(TextReportExtension.class)
public class TestSetup {

    @BeforeEach
    void setUp() {
        open("https://www.google.com/");
    }
}
