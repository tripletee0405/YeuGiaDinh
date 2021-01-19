package tests;

import core.BaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;

public class CheckAdsYGD extends BaseTest {
    HomePage homePage = new HomePage(getDriver());
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void checkAdsYGD() {
        homePage.urlYGD();
        softAssert.assertEquals(homePage.isDisplayedLeftAds(), true,"LeftAds is not displayed");
        softAssert.assertEquals(homePage.isDisplayedSponsorAds(), true,"SponsorAds is not displayed");
        softAssert.assertEquals(homePage.isDisplayedRightAds1(), true,"RightAds3 is not displayed");
        softAssert.assertEquals(homePage.isDisplayedRightAds2(), true,"RightAds2 is not displayed");
        softAssert.assertEquals(homePage.isDisplayedRightAds3(), true,"RightAds3 is not displayed");
        softAssert.assertAll();
    }
}