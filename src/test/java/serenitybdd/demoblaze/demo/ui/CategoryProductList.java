package serenitybdd.demoblaze.demo.ui;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import serenitybdd.demoblaze.demo.ProductCategories.Category;
import org.openqa.selenium.WebDriver;

public class CategoryProductList extends PageObject {

    public void selectProduct(Category category){

        //WebElement selectedSuburb = getDriver().findElement(By.xpath("//a[contains(.,'" + "Phones" + "')]"));
        //selectedSuburb.click();
        $("//div/a[contains(.,'" + "Phones" + "')]").click();
        //$("*[class=list-group-item] *[id=itemc]").find(By.linkText(category.name())).click();
        //$("//*[@id=\"cat\"]").find(By.linkText(category.name())).click();
        //*[@id="itemc"]
        //*[@id="itemc"]
    }
}
