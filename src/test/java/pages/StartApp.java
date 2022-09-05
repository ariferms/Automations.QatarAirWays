package pages;

import Method.Methods;
import org.example.StepImplementation;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class StartApp extends StepImplementation {
    Methods methods;

    public StartApp() {

        methods = new Methods();
    }

    public void appStarControl(){
        Assertions.assertTrue(isElementVisible(By.id("com.m.qr:id/main_text"),10));
        Assertions.assertTrue(isElementVisible(By.id("com.m.qr:id/enable_location_button"),10));
        Assertions.assertTrue(isElementVisible(By.id("com.m.qr:id/skip_button"),10));
    }
}
