package pages;

import methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ProductPage extends Methods {


    public void chooseProduct() {
        waitForSecond(2000);
        getTextFromElement("product_cart");
        clickToElement("product_cart");
        nextTab();
    }

    public void addProducts() {
        clickToElement2("product_first_add_button");
        waitForSecond(5000);
        clickToElement("product_close_modal_icon");
        clickToElement("product_second_add_button");
        waitForSecond(5000);
        clickToElement("product_shopping_cart_button");
    }

}
