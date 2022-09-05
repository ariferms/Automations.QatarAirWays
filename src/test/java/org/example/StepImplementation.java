package org.example;

import Method.Methods;
import com.thoughtworks.gauge.Step;
import driver.Driver;
//import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.BookPage;
import pages.HomePage;
import pages.StartApp;

import static org.assertj.core.api.Assertions.assertThat;

public class StepImplementation extends Methods {
    Methods methods;

    public StepImplementation() {

        methods = new Methods();
    }

    private static HomePage homePage = new HomePage();
    private static StartApp startApp = new StartApp();
    private static BookPage bookPage = new BookPage();



    @Step("Qatar Airways uygulaması açılır ve açıldığı kontrol edilir")
    public void loginControl() {
        startApp.appStarControl();
    }

    @Step("<duration> saniye bekle")
    public void waitForSkip(int duration) {
        methods.waitBySeconds(duration);
    }

    @Step("1. skip butonunu bul ve tıkla")
    public void skip1() {
        homePage.clikToSkipOne();
    }

    @Step("2. skip butonunu bul ve tıkla")
    public void skip2() {
        homePage.clikToSkipTwo();
    }

    @Step("Decline butonunu bul ve tıkla")
    public void skipDecline() {
        homePage.clikToDecline();
    }

    @Step("Book menüsünü bul ve tıkla")
    public void foundAndClick(){bookPage.clickBookMenu();}

    @Step("Seyehat tipi olarak “One Way” seçilir")
    public void selectedOneWay(){bookPage.selectOneWay();}

    @Step("Kalkış havaalanı selectboxına tıklanır")
    public void clickedOutBoundFlight(){bookPage.clickOutBoundFlight();}

    @Step("Kalkış havaalanı olarak <OutBound> seçilir")
    public void selectedOutBound(String OutBound){
        bookPage.selectOutAndInBoundFlight(OutBound);
        bookPage.selectAirPort();
    }

    @Step("Varış havaalanı selectboxına tıklanır")
    public void clickedInBoundFlight(){bookPage.clickInBoundFlight();}

    @Step("Varış havaalanı olarak <InBound> seçilir")
    public void selectedInBound(String InBound){
        bookPage.selectOutAndInBoundFlight(InBound);
        bookPage.selectAirPort();
    }

    @Step("Bugünden 7 gün sonrası için bir gidiş tarihi seçilir")
    public void selectDate(){bookPage.dateCreated();}

    @Step("Arama butonuna tıklanır")
    public void clickSearch(){bookPage.clickSearchButton();}

    @Step("Uçuş seçim ekranının geldiği kontrol edilir ve rastgele bir uçuş seçilir")
    public void randomFlight(){bookPage.randomSelectFlight();}

    @Step("Economy class seçeneğine tıklanır")
    public void clickEconomy(){bookPage.clickEconomy();}

}
