package pages;

import methods.Methods;

public class ProductPage extends Methods {

    public void chooseProduct() {
        waitForSecond(2000);
        getTextFromElement("product_cart");
        clickToElement("product_cart");
        nextTab();
    }

    public void addProducts() {
        clickToElement("product_first_add_button");
        waitForSecond(5000);
        clickToElement("product_close_modal_icon");
        clickToElement("product_second_add_button");
        waitForSecond(2000);
        clickToElement("product_shopping_cart_button");
    }

}
