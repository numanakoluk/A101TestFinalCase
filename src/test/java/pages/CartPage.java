package pages;

import PageObject.Methods;

public class CartPage extends Methods {

    public void checkForProducts() {
        expectedText = getTextFromElement("cart_first_product_item");
        compareTextWithExpected("cart_first_product_item");
        waitForSecond(2000);
        expectedText = getTextFromElement("cart_second_product_item");
        compareTextWithExpected("cart_second_product_item");
    }
}
