package com.virgingames.testsuite;

import com.virgingames.pages.HomePage;
import com.virgingames.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HomePageTest extends BaseTest {

    HomePage homePage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();

    }

    @Test
    public void test() {
        homePage.clickOnAcceptCookies();

        homePage.clickOnAllGamesTab();

        String expectedMessage = "Online Slots";
        String actualMessage = homePage.verifyText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }
}
