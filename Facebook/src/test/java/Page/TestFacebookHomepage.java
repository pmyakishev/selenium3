package Page;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.CommonAPI;

/**
 * Created by Rajib on 1/3/2017.
 */
public class TestFacebookHomepage extends CommonAPI {
    @Test
    public void testFacebookHomepage(){
        System.out.println("Our Test is successful for  :"+driver.getCurrentUrl());
        //clickByXpath("//*[@id='nav-xshop']/a[2]");
    }
}
