package Page;

import BBMethods.BBCommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by admin on 1/30/17.
 */
public class TestSuccessfullLogin extends BBCommonAPI{

    @Test
    public void testSuccessfulLogIn() throws InterruptedException {
        BBCommonAPI bbapi = PageFactory.initElements(driver,BBCommonAPI.class);
        successfulLogIn();
    }
}
