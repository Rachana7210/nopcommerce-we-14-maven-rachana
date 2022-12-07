package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
    By firstNameField = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastNameField = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By emailField = By.xpath("//input[@id='BillingNewAddress_Email']");
    By countryField = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By cityField = By.xpath("//input[@id='BillingNewAddress_City']");
    By addressField = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By zipPostalCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By clickContinue = By.xpath("//button[@onclick='Billing.save()']");
    By nextDayAir = By.xpath("//input[@id='shippingOption_1']");
    By continueAir = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By creditCard = By.xpath("//input[@id='paymentMethod_1']");
    By continueCard = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By masterCard = By.xpath("//select[@id='CreditCardType']");
    By cardHolderName = By.xpath("//input[@id='CardholderName']");
    By cardNumber = By.xpath("//input[@id='CardNumber']");
    By expiryMonth = By.xpath("//select[@id='ExpireMonth']");
    By expiryYear = By.xpath("//select[@id='ExpireYear']");
    By cardCode = By.xpath("//input[@id='CardCode']");
    By continueCheckout = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By verifyCreditCardMethod = By.xpath("//span[normalize-space()='Credit Card']");
    By verifyShippingMethod = By.xpath("//span[normalize-space()='Next Day Air']");
    By verifyTotal = By.xpath("(//strong[contains(text(),'$2,950.00')])[2]");
    By confirm = By.xpath("//button[normalize-space()='Confirm']");
    By continueHomepage = By.xpath("//button[contains(text(),'Continue')]");
    By verifyThankYou = By.xpath("//h1[normalize-space()='Thank you']");
    By verifySuccessMessage = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By welcomeToStore = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By countryIdFieldNokia = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By cityFieldNokia = By.xpath("//input[@id='BillingNewAddress_City']");
    By addressField1Nokia = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By zipCodeNokia = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumberNokia = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueAirNokia = By.xpath("//button[@onclick='Billing.save()']");
    By dayAir2nd = By.xpath("//input[@id='shippingOption_2']");
    By continueCardNokia = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By creditCardNokia = By.xpath("//input[@id='paymentMethod_1']");
    By continueCardDetailsNokia = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By visa = By.xpath("(//select[@id='CreditCardType'])[1]");
    By cardHolderNameNokia = By.xpath("//input[@id='CardholderName']");
    By cardNumberNokia = By.xpath("//input[@id='CardNumber']");
    By expiryMonthNokia = By.xpath("//select[@id='ExpireMonth']");
    By expiryYearNokia = By.xpath("//select[@id='ExpireYear']");
    By cardCodeNokia = By.xpath("//input[@id='CardCode']");
    By continueCheckoutNokia = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By verifyCreditCardMethodNokia = By.xpath("//span[contains(text(),'Credit Card')]");
    By verifyShippingMethodNokia = By.xpath("//span[contains(.,'2nd Day Air')]");
    By verifyTotalNokia = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");
    By confirmNokia = By.xpath("//button[normalize-space()='Confirm']");
    By verifyThankYouNokia = By.xpath("//h1[contains(text(),'Thank you')]");
    By verifySuccessMessageNokia = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continueHomepageNokia = By.xpath("//button[contains(text(),'Continue')]");
    By logOut = By.xpath("//a[contains(text(),'Log out')]");



    public void enterFirstName() {
        sendTextToElement(firstNameField, "Krishna");
    }

    public void enterLastName() {
        sendTextToElement(lastNameField, "Parmar");
    }

    public void enterEmail() {
        sendTextToElement(emailField, "Krish12@gmail.com");
    }

    public void enterCountry() {
        sendTextToElement(countryField, "United Kingdom");
    }

    public void enterCity() {
        sendTextToElement(cityField, "London");
    }

    public void enterAddress1() {
        sendTextToElement(addressField, "96 Kenmore park");
    }

    public void enterZipPostalCode() {
        sendTextToElement(zipPostalCode, "SW16 4RJ");
    }

    public void enterPhoneNumber() {
        sendTextToElement(phoneNumber, "07985640854");
    }

    public void clickOnContinue() {
        clickOnElement(clickContinue);
    }

    public void clickNextDayAir() {
        clickOnElement(nextDayAir);
    }

    public void clickOnContinueAir() {
        clickOnElement(continueAir);
    }

    public void clickOnCreditCard() {
        clickOnElement(creditCard);
    }

    public void clickOnContinueCard() {
        clickOnElement(continueCard);
    }

    public void selectMasterCard() {
        selectByVisibleTextFromDropDown(masterCard, "Master card");
    }

    public void enterCardHolderName() {
        sendTextToElement(cardHolderName, "Krishna Parmar");
    }

    public void enterCardNumber() {
        sendTextToElement(cardNumber, "5467 4323 0078 5647");
    }

    public void enterExpiryMonth() {
        sendTextToElement(expiryMonth, "07");
    }

    public void enterExpiryYear() {
        sendTextToElement(expiryYear, "2025");
    }

    public void enterCardCode() {
        sendTextToElement(cardCode, "305");
    }

    public void clickOnContinueCheckout() {
        clickOnElement(continueCheckout);
    }

    public String getVerifyCreditCardMethod() {
        return getTextFromElement(verifyCreditCardMethod);
    }

    public String getVerifyShippingMethod() {
        return getTextFromElement(verifyShippingMethod);
    }

    public String getVerifyTotal() {
        return getTextFromElement(verifyTotal);
    }

    public void clickOnConfirm() {
        clickOnElement(confirm);
    }
    public void clickOnContinueHomepage() {
        clickOnElement(continueHomepage);
    }

    public String getVerifyThankYou() {
        return getTextFromElement(verifyThankYou);
    }
    public String getVerifySuccessMessage() {
        return getTextFromElement(verifySuccessMessage);
    }

    public String verifyWelcomeToStore() {
        return getTextFromElement(welcomeToStore);
    }
    public void selectCountryIdFieldNokia() {
       selectByVisibleTextFromDropDown(countryIdFieldNokia, "United Kingdom");
    }

    public void enterCityFieldNokia() {
        sendTextToElement(cityFieldNokia, "London");
    }

    public void enterAddressField1Nokia() {
        sendTextToElement(addressField1Nokia, "12 Charlton Road");
    }

    public void enterZipCodeNokia() {
        sendTextToElement(zipCodeNokia, "HA5 OTD");

    }

    public void enterPhoneNumberNokia() {
        sendTextToElement(phoneNumberNokia, "07890543290");
    }

    public void clickContinueAirNokia() {
        clickOnElement(continueAirNokia);
    }

    public void clickDayAir2nd() {
        clickOnElement(dayAir2nd);
    }

    public void clickContinueCardNokia() {
        clickOnElement(continueCardNokia);
    }

    public void clickCreditCardNokia() {
        clickOnElement(creditCardNokia);
    }

    public void clickContinueCardDetailsNokia() {
        clickOnElement(continueCardDetailsNokia);
    }

    public void selectVisa() {
       selectByVisibleTextFromDropDown(visa, "visa");
    }

    public void enterCardHolderNameNokia() {
        sendTextToElement(cardHolderNameNokia, "Viha Maru");
    }

    public void enterCardNumberNokia() {
        sendTextToElement(cardNumberNokia, "4789 5467 4357 9807");
    }

    public void enterExpiryMonthNokia() {
        sendTextToElement(expiryMonthNokia, "08");
    }

    public void enterExpiryYearNokia() {
        sendTextToElement(expiryYearNokia, "2025");
    }

    public void enterCardCodeNokia() {
        sendTextToElement(cardCodeNokia, "302");
    }

    public void clickOnContinueCheckoutNokia() {
        clickOnElement(continueCheckoutNokia);
    }

    public String getVerifyCreditCardMethodNokia() {
        return getTextFromElement(verifyCreditCardMethodNokia);
    }

    public String getVerifyShippingMethodNokia() {
        return getTextFromElement(verifyShippingMethodNokia);
    }

    public String getVerifyTotalNokia() {
        return getTextFromElement(verifyTotalNokia);
    }

    public void clickOnConfirmNokia() {
        clickOnElement(confirmNokia);
    }

    public String getVerifyThankYouNokia() {
        return getTextFromElement(verifyThankYouNokia);
    }

    public String getVerifySuccessMessageNokia() {
        return getTextFromElement(verifySuccessMessageNokia);
    }

    public void clickOnContinueHomepageNokia() {
        clickOnElement(continueHomepageNokia);
    }

}
