package Page;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.DropDownMenus;

/**
 * Created by admin on 1/27/17.
 */
public class TestDropdownMenus extends DropDownMenus {

    @Test
    public void DropDownMenu() throws InterruptedException{
        DropDownMenus dd = PageFactory.initElements(driver,DropDownMenus.class);
        dd.dropDownMenu();
        sleepFor(1);
    }
}
