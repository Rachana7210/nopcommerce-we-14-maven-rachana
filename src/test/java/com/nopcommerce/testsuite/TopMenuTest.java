package com.nopcommerce.testsuite;

import com.nopcommerce.pages.TopMenuPage;
import com.nopcommerce.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    TopMenuPage topMenu = new TopMenuPage();
    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        topMenu.clickOnComputerTab();
        Assert.assertEquals(topMenu.verifyComputerTab(),"Computers");
        topMenu.clickOnElectronicsTab();
        Assert.assertEquals(topMenu.verifyElectronicsTab(),"Electronics");
        topMenu.clickOnApparelTab();
        Assert.assertEquals(topMenu.verifyApparelTab(),"Apparel");
        topMenu.clickOnDigitalDownloadsTab();
        Assert.assertEquals(topMenu.getVerifyDigitalDownloadsTab(),"Digital downloads");
        topMenu.clickOnBooksTab();
        Assert.assertEquals(topMenu.getVerifyBooksTab(),"Books");
        topMenu.clickOnJewelryTab();
        Assert.assertEquals(topMenu.verifyJewelryTab(),"Jewelry");
        topMenu.clickOnGiftCardTab();
        Assert.assertEquals(topMenu.verifyGiftCardTab(),"Gift Cards");
    }

}
