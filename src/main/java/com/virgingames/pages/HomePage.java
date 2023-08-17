package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Accept']")
    WebElement acceptAllCookies;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'All Games')]")
    WebElement allGamesTab;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Online Slots')]")
    WebElement verifyOnlineSlots;


    public void clickOnAcceptCookies() {
        Reporter.log("Accept all cookies" + acceptAllCookies.toString());
        clickOnElement(acceptAllCookies);

    }

    public void clickOnAllGamesTab() {
        Reporter.log("Click on all Games tab" + allGamesTab.toString());
        clickOnElement(allGamesTab);

    }

    public String verifyText() {
        Reporter.log("verify text" + verifyOnlineSlots.toString());
        return getTextFromElement(verifyOnlineSlots);
    }
}
