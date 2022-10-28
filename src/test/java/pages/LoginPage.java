package pages;

import methods.Methods;

public class LoginPage extends Methods {

    public void login() {
        sendKeysToElement("login_email_input", "user_email");
        clickToElement("login_email_button");
        sendKeysToElement("login_password_input", "user_password");
        clickToElement("login_password_button");
    }
}
