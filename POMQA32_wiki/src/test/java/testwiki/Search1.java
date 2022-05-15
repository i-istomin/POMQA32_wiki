package testwiki;

import configwiki.ConfigurationWiki;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import screens.MainScreen;
import screens.SearchScreen;

public class Search1 extends ConfigurationWiki {
    @BeforeMethod
    public void preConditions(){
        new MainScreen(driver).clickOnSearchFromMainPage();
    }

    @Test
    public void search1(){
        boolean isLiner=new SearchScreen(driver)
                .fillInText("dog")
                .closeBoard()
                .isLiner();
        Assert.assertTrue(isLiner);
    }
}
