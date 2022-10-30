package pages;

import methods.Methods;
import org.openqa.selenium.support.ui.Wait;

public class HomePage extends Methods {

    public void navigateToHomePage() {
        navigateToUrl("base_url");
    }

    public void navigateToLogIn() {
        clickToElement("home_login_dropdown");
        waitForSecond(2000);
        clickToElement("home_login_item");
    }

    public void searchForProduct(String product) {
        clickToElement("home_search_input");
        sendKeysToElement("home_search_input", product);
        clickToElement("home_search_button");
    }

    public void checkForLogin() {
        waitForSecond(2000);
        elementIsDisplayed("home_logged_in_dropdown");
        expectedText = getTextFromElement("home_logged_in_dropdown");
        compareTextWithExpected("home_logged_in_dropdown");
    }

    public void clickAcceptCookies() {
        clickToElement("cookies_accept_button");
        waitForSecond(2000);
    }

}
