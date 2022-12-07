package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By registerLink = By.linkText("Register");
    By logOut = By.xpath("//a[contains(text(),'Log out')]");


    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }
    public void clickOnLogOut() {
        clickOnElement(logOut);
    }
    public String getUrl() {
        return driver.getCurrentUrl();
    }

}
