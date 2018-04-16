package ui;

import BBMethods.BBCommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by admin on 2/3/17.
 */
public class FindYourStore extends BBCommonAPI {

    public static final String notMyPhone = System.getenv("NOT_MY_PHONE");

    @FindBy(how = How.CSS, using = "#user.phone")
    public static WebElement phone;
    @FindBy(how = How.CSS, using = ".btn.btn-lg.btn-block.btn-primary")
    public static WebElement continueToPaymentInfo;

    public static FindYourStore getFindYourStore () {
        phone.sendKeys(notMyPhone);
        continueToPaymentInfo.click();
        return new FindYourStore();
    }
}
