package pages;

import methods.Methods;

public class LoginPage extends Methods {

    public void login() {
        sendKeysToElement("login_email_input", "hepsiburadatestdeneme@gmail.com");
        clickToElement("login_email_button");
        sendKeysToElement("login_password_input", "0018000N.a");
        clickToElement("login_password_button");
    }
}
