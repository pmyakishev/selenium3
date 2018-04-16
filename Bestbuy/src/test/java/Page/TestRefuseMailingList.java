package Page;

import BBMethods.BBCommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by admin on 1/31/17.
 */
public class TestCloseMailingList extends BBCommonAPI {

    @Test
    public void TestRefuseMailingList() throws InterruptedException{
        BBCommonAPI bb = PageFactory.initElements(driver, BBCommonAPI.class);
        bb.refuseMailingList();
    }
}
