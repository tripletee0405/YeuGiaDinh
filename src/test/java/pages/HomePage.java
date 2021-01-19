package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {
    //Ads Element
    @FindBy(xpath = "//*[@id='ads_7']/div/ins")
    private WebElement leftAds;
    @FindBy(xpath = "//*[@id='ads_19']")
    private WebElement sponsorAds;
    @FindBy(xpath = "//*[@id='ads_1']/div[2]/ins")
    private WebElement rightAds1;
    @FindBy(xpath = "//*[@id='ads_2']/div/ins")
    private WebElement rightAds2;
    @FindBy(xpath = "//*[@id='ads_3']/div/ins")
    private WebElement rightAds3;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void urlYGD() {
        driver.navigate().to("https://yeugiadinh.vn/");
        driver.manage().window().maximize();
    }

    public boolean isDisplayedLeftAds() {
        boolean flag = checkIsVisibility(leftAds);
        return flag;
    }

    public boolean isDisplayedSponsorAds() {
        boolean flag = checkIsVisibility(sponsorAds);
        return flag;
    }

    public boolean isDisplayedRightAds1() {
        boolean flag = checkIsVisibility(rightAds1);
        return flag;
    }

    public boolean isDisplayedRightAds2() {
        boolean flag = checkIsVisibility(rightAds2);
        return flag;
    }

    public boolean isDisplayedRightAds3() {
        boolean flag = checkIsVisibility(rightAds3);
        return flag;
    }

    private boolean checkIsVisibility(WebElement ele) {
        boolean flag = true;
        try {
            getWait().until(ExpectedConditions.visibilityOf(ele));
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }
}
