package Page;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.AddToCart;

/**
 * Created by admin on 1/20/17.
 */
public class TestAddMBPToCart extends AddToCart {

    @Test
    public void AddMBPToCart() throws InterruptedException {
        AddToCart add =PageFactory.initElements(driver, AddToCart.class);
        sleepFor(1);
        add.addMBPToCart();
    }
}
