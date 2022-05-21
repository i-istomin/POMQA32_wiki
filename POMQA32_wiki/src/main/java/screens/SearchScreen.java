package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SearchScreen extends MainScreen{
    public SearchScreen(AppiumDriver<MobileElement> driver){
        super(driver);
    }


    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/search_src_text']")
    MobileElement textInput;
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/page_list_item_container']")
    MobileElement liner;

    public SearchScreen fillInText(String text) {
      // should(textInput,20);
        type(textInput, text);
        return this;
    }

    public SearchScreen closeBoard() {
        hideKeyboard();
        return this;
    }

    public boolean isLiner() {
        return liner.isDisplayed();
    }

    public SearchScreen isLinerPresent() {
        Assert.assertTrue(liner.isDisplayed());
        return this;
    }
}
//ira@gmail.com/ Iraa777!/