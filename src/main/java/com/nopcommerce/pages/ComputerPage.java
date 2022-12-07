package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {

    By computerTab = By.linkText("Computers");
    By desktopTab = By.linkText("Desktops");

    By positionZtoA = By.name("products-orderby");
    By positionAtoZ = By.name("products-orderby");
    By textMessage = By.xpath("//*[@id=\"products-orderby\"]/option[3]");
    By addToCartButton = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");
    By verifyMessage1 = By.xpath("//h2[@class='product-title']//a[normalize-space()='Build your own computer']");
    public void clickOnComputerTab(){
        clickOnElement(computerTab);
    }
    public void clickOnDesktop(){
        clickOnElement(desktopTab);
    }
    public void setNameZtoA(){
        //clickOnElement(positionZtoA);
       selectByVisibleTextFromDropDown(positionZtoA,"Name: Z to A");
    }
    public void setNameAtoZ(){
       selectByVisibleTextFromDropDown(positionAtoZ,"Name: A to Z");
    }
    public String getOrderArrange(){
        return getTextFromElement(textMessage);
    }
    public void clickOnAddToCart(){
        mouseHoverToElementAndClick(addToCartButton);
    }
    public String textMessage(){
        return getTextFromElement(verifyMessage1);
    }

}