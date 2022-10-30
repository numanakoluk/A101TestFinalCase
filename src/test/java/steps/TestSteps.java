package steps;

import base.Driver;
import io.cucumber.java.en.Given;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class TestSteps {

    private static final Logger LOGGER = LogManager.getLogger(Driver.class);

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();

    @Given("^User navigates to home page$")
    public void user_navigates_to_home_page() {
        homePage.navigateToHomePage();
        LOGGER.info("Kullanıcı Hepsiburada.com sitesini Ziyaret Eder.");
    }

    @Given("^User searches for \"([^\"]*)\"$")
    public void user_searches_for(String text) {
        homePage.searchForProduct(text);
        LOGGER.info("Kullanıcı: " + text +" kelimesini arama yaptı.");
    }

    @Given("^User chooses product$")
    public void user_chooses_product() {
        productPage.chooseProduct();
        LOGGER.info("Kullanıcı seçilen ürünü aradı ve tıkladı.");
    }
    @Given("^Cookies are expected$")
    public void cookies_are_expected() {
        homePage.clickAcceptCookies();
        LOGGER.info(" Çerezler kabul edildi.");
    }
    @Given("^User adds two product from different shops$")
    public void user_adds_two_product_from_different_shops() {
        productPage.addProducts();
        LOGGER.info("Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.");
    }

    @Given("^Products should be added to shopping cart$")
    public void products_should_be_added_to_shopping_cart() {
        cartPage.checkForProducts();
        LOGGER.info("Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında(Assertion) ile doğrulandı.");
    }

    @Given("^User logs in with credentials$")
    public void user_logs_in_with_credentials() {
        homePage.navigateToLogIn();
        loginPage.login();
        LOGGER.info("Kullanıcı Giriş İşlemi Yapılır(GMAIL ile Giriş).");

    }

    @Given("^User should be logged in$")
    public void user_should_be_logged_in() {
        LOGGER.info("Yönlendirmeden sonra anasayfada(Assertion) ile kullanıcı giriş işleminin yapıldığı doğrulanır.");
        homePage.checkForLogin();
    }
}
