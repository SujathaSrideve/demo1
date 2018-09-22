package serenitybdd.demoblaze.demo.steps;

import net.thucydides.core.annotations.Step;
import serenitybdd.demoblaze.demo.ProductCategories.Category;
import serenitybdd.demoblaze.demo.ui.DemoBlazeHomePage;
import serenitybdd.demoblaze.demo.ui.CurrentPage;
import static org.assertj.core.api.Assertions.assertThat;
import serenitybdd.demoblaze.demo.ui.CategoryProductList;

public class Customer {

    DemoBlazeHomePage demoBlazeHomePage;
    CategoryProductList categoryProductList;
    CurrentPage currentPage;


    @Step
    public void isOnTheHomePage(){
        demoBlazeHomePage.open();

    }
    @Step
    public void shouldSeePageContainingAllMobilePhones(String mobilename){
    //assertThat(CurrentPage.getPageSource()).isEqualTo(mobilename);
        currentPage.checkProductList(mobilename);

    }
    @Step
    public void navigatesToCategory(Category category){
    categoryProductList.selectProduct(category);
    }


}
