package serenitybdd.demoblaze.demo.features.browse_site;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import serenitybdd.demoblaze.demo.ProductCategories.Category;
import serenitybdd.demoblaze.demo.steps.Customer;
import serenitybdd.demoblaze.demo.ProductCategories.Category;
import net.thucydides.core.annotations.ClearCookiesPolicy;
import org.junit.Test;

@RunWith(SerenityRunner.class)
public class WhenBrowsingProductCategories {

    @Steps
    Customer user;

    @Managed
    WebDriver browser;

    @Test
    public void shouldBeAbleToNavigateToMobilesCategory(){
        // Given
        user.isOnTheHomePage();

        //when
        user.navigatesToCategory(Category.Phones);

        //Then
        user.shouldSeePageContainingAllMobilePhones("HTC One M9");



    }

}
