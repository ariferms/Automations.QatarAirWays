package pages;

import Method.Methods;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.example.StepImplementation;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class BookPage extends StepImplementation {
    Methods methods;

    public BookPage() {

        methods = new Methods();
    }

    public void clickBookMenu() {
        Assertions.assertTrue(isElementVisible(By.id("com.m.qr:id/nav_menu_book"), 10));
        Assertions.assertTrue(isElementClickable(By.id("com.m.qr:id/nav_menu_book"), 10));
        methods.clickElement(By.id("com.m.qr:id/nav_menu_book"));
    }

    public void selectOneWay() {
        Assertions.assertTrue(isElementVisible(MobileBy.AccessibilityId("One-way"), 10));
        Assertions.assertTrue(isElementClickable(MobileBy.AccessibilityId("One-way"), 10));
        methods.clickElement(MobileBy.AccessibilityId("One-way"));
    }

    public void clickOutBoundFlight() {
        Assertions.assertTrue(isElementVisible(By.id("com.m.qr:id/rvmp_fragment_rtow_flight_selection_origin_holder"), 10));
        Assertions.assertTrue(isElementClickable(By.id("com.m.qr:id/rvmp_fragment_rtow_flight_selection_origin_holder"), 10));
        methods.clickElement(By.id("com.m.qr:id/rvmp_fragment_rtow_flight_selection_origin_holder"));
    }

    public void selectOutAndInBoundFlight(String location) {
        Assertions.assertTrue(isElementVisible(By.id("com.m.qr:id/rvmp_fragment_ond_selection_filter_edittext"), 10));
        Assertions.assertTrue(isElementClickable(By.id("com.m.qr:id/rvmp_fragment_ond_selection_filter_edittext"), 10));
        methods.sendKeys(By.id("com.m.qr:id/rvmp_fragment_ond_selection_filter_edittext"), location);
    }

    public void clickInBoundFlight() {
        Assertions.assertTrue(isElementVisible(By.id("com.m.qr:id/rvmp_fragment_rtow_flight_selection_destination_holder"), 10));
        Assertions.assertTrue(isElementClickable(By.id("com.m.qr:id/rvmp_fragment_rtow_flight_selection_destination_holder"), 10));
        methods.clickElement(By.id("com.m.qr:id/rvmp_fragment_rtow_flight_selection_destination_holder"));
    }

    public void selectAirPort() {
        List<MobileElement> elements = appiumDriver.findElements(By.id("com.m.qr:id/rvmp_item_ond_selection_list_root_view"));
        elements.get(0).click();
    }

    public void dateCreated() {
        final Calendar now = GregorianCalendar.getInstance();
        int dayNumber = now.get(Calendar.DAY_OF_MONTH);
        dayNumber = dayNumber + 7;
        methods.clickElement(By.xpath("(//android.widget.TextView[@resource-id='com.m.qr:id/rvmp_booking_calendar_day_text_view'])[22]"));
        methods.clickElement(By.id("com.m.qr:id/fragment_calendar_confirm_button"));
    }

    public void clickSearchButton() {
        Assertions.assertTrue(isElementVisible(By.id("com.m.qr:id/rvmp_booking_search_flights_button"), 10));
        Assertions.assertTrue(isElementClickable(By.id("com.m.qr:id/rvmp_booking_search_flights_button"), 10));
        methods.clickElement(By.id("com.m.qr:id/rvmp_booking_search_flights_button"));
    }

    public void randomSelectFlight() {
        List<MobileElement> elements = appiumDriver.findElements(By.id("com.m.qr:id/rvmp_item_search_result_root_view"));
        elements.get(1).click();
    }

    public void clickEconomyhButton() {
        Assertions.assertTrue(isElementVisible(By.id("com.m.qr:id/rvmp_activity_flight_details_select_button"), 10));
        Assertions.assertTrue(isElementClickable(By.id("com.m.qr:id/rvmp_activity_flight_details_select_button"), 10));
        methods.clickElement(By.id("com.m.qr:id/rvmp_activity_flight_details_select_button"));
    }
}
