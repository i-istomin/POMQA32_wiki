package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SearchScreen extends MainScreen{
    public SearchScreen(AppiumDriver<MobileElement> driver){
        super(driver);
    }

    @FindBy(xpath = "?????")
    MobileElement textInput;
    @FindBy(xpath = )
    MobileElement





    public boolean isLiner(){
        return liner.isDisplayed();
    }

    public SearchScreen closeBoard(){
        hideKeyboard();
        return this;

    }

    public SearchScreen isLinerPresent(){
        Assert.assertTrue(liner.);
    }

    public Object fillInText(String text) {
        should(textInput,20);
        type(textInput,text);
        return this;
    }
}
