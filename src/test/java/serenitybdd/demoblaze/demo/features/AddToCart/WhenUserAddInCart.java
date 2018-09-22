package serenitybdd.demoblaze.demo.features.AddToCart;

import org.junit.Test;
import serenitybdd.demoblaze.demo.ProductCategories.Category;
import serenitybdd.demoblaze.demo.steps.Customer;

public class WhenUserAddInCart {

    Customer user;

    @Test
    public void userInSelectedMobilePage(){
        //Given
        user.isInSelectedPhonePage(Category.Phones);
        //When
        user.addToCartLinkVisible();
        //Then
        user.phoneAddedToCart();

    }
}
