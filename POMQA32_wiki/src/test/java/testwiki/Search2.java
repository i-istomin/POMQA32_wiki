package testwiki;

import configwiki.ConfigurationWiki;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import screens.MainScreen;

import java.lang.reflect.Method;

public class Search2 extends ConfigurationWiki {

    @BeforeMethod
    public void preConditions(Method m){
        new MainScreen(driver).clickOnSearchFromMainPage();
        logger.info(("Start test" + m.getName()));
    }
    @Test
    public void search2(){

        logger.info("Starting 'search2' test");
        boolean isLiner = new MainScreen(driver)
                .clickOnSearchFromMainPage()
                .fillInText("dog")
                .closeBoard()
                .isLiner();
        logger.info("Checking if the element displayed");
        Assert.assertTrue(isLiner);

        logger.info("Test 'search2' passed successfully");
    }
}
