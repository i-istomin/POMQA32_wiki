package testwiki;

import configwiki.ConfigurationWiki;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.MainScreen;

public class Search2 extends ConfigurationWiki {


    @Test
    public void search2(){
        boolean isLiner = new MainScreen(driver)
                .clickOnSearchFromMainPage()
                .fillInText("dog")
                .closeBoard()
                .isLiner();
        Assert.assertTrue(isLiner);
    }
}
