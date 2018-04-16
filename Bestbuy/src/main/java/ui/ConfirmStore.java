package ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static ui.AddToCart.findAStore;

/**
 * Created by admin on 2/3/17.
 */
public class CheckOut {
    @FindBy(how = How.CSS, using = ".modal-select-store.modal-select-store--primary")
    public static WebElement continueStore;

    public CheckOut confirmLacotion() throws InterruptedException{
        findAStore.click();
        //provideLocation();
        continueStore.click();
        return new CheckOut();
    }


}

