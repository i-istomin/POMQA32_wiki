package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TooltipScreen extends  BaseScreen {
    public TooltipScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/explore_overflow_account_name']")
    MobileElement logInButton;
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/explore_overflow_log_out']")
    MobileElement logOutButton;

    public LoginScreen clickOnLoginWikiButton() {
        logInButton.click();
        return new LoginScreen(driver);
    }
    public  boolean isLogged(){
        should(logInButton,20);
        return  logInButton.isDisplayed();
    }
    public TooltipScreen isAccountPresentAssert() {
        Assert.assertTrue(logOutButton.isDisplayed());
        should(logOutButton,20);
        return this;
    }
    public MainScreen logOut(){
        should(logOutButton,20);
        logOutButton.click();
        return new MainScreen(driver);}

}


