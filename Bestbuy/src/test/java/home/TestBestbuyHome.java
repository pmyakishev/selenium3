package home;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.CommonAPI;

import javax.smartcardio.CommandAPDU;

/**
 * Created by Rajib on 1/13/2017.
 */
public class TestBestbuyHome extends CommonAPI{
    @Test

    public void testHome(){
        clickByXpath(".//*[@id=\"header\"]/div[2]/div/nav[2]/ul/li[1]/a");
        navigateBack();
        clickByXpath(".//*[@id=\"menu0\"]");
    }
}
