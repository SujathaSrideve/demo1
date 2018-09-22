package serenitybdd.demoblaze.demo.ui;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

public class CurrentPage extends PageObject {

    /*public static boolean getPageSource() {

        browser.PageSource.Contains("expected message");
        driver.findElement(By.xpath("//*[contains(text(),'someText')]"));
       // driver.findElement(By.xpath("//*[contains(text(),'HTC One M9')]"));

    }*/

    public void checkProductList(String mobilename) {

        this.containsText("HTC One M9");
    }
}
