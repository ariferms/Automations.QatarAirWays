package pages;

import Method.Methods;
import com.thoughtworks.gauge.Step;
import driver.Driver;
import org.junit.jupiter.api.Assertions;
//import org.assertj.core.api.Assertions;
import org.example.StepImplementation;
import org.openqa.selenium.By;

public class HomePage extends StepImplementation {

    Methods methods;

    public HomePage() {

        methods = new Methods();
    }

    public void clikToSkipOne() {
        Assertions.assertTrue(isElementVisible(By.id("com.m.qr:id/skip_button"),10));
        Assertions.assertTrue(isElementClickable(By.id("com.m.qr:id/skip_button"),10));
        methods.clickElement(By.id("com.m.qr:id/skip_button"));
    }
    public void clikToSkipTwo() {
        Assertions.assertTrue(isElementVisible(By.id("com.m.qr:id/onboarding_skip_button"),10));
        Assertions.assertTrue(isElementClickable(By.id("com.m.qr:id/onboarding_skip_button"),10));
        methods.clickElement(By.id("com.m.qr:id/onboarding_skip_button"));
    }
    public void clikToDecline() {
        Assertions.assertTrue(isElementVisible(By.id("com.m.qr:id/push_consent_decline"),10));
        Assertions.assertTrue(isElementClickable(By.id("com.m.qr:id/push_consent_decline"),10));
        methods.clickElement(By.id("com.m.qr:id/push_consent_decline"));
    }

}
