package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class CellPhonesPage extends Utility {
    By electronics = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By cellPhones = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");
    By verifyCellPhones = By.xpath("//h1[contains(text(),'Cell phones')]");
    By listView = By.xpath("//a[contains(text(),'List')]");
    By nokiaLumia = By.xpath("//div[@class='picture']//img[@title='Show details for Nokia Lumia 1020']");

    public void mouseHoverElectronics() {
        mouseHoverToElement(electronics);
    }

    public void hooverCellPhones() {
        mouseHoverToElementAndClick(cellPhones);
    }

    public void clickOnNokiaLumia() {
        clickOnElement(nokiaLumia);
    }

    public String getVerifyCellPhones() {
        return getTextFromElement(verifyCellPhones);
    }

    public void clickListView() {
        clickOnElement(listView);
    }

}
