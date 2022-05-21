package testwiki;

import configwiki.ConfigurationWiki;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import screens.MainScreen;
import screens.SearchScreen;

import java.lang.reflect.Method;

public class Search1 extends ConfigurationWiki {
    @BeforeMethod
    public void preConditions(Method m){
        new MainScreen(driver).clickOnSearchFromMainPage();
        logger.info(("Start test" + m.getName()));
    }

    @Test
    public void search1(){
        logger.info("Starting 'search1' test");
        boolean isLiner=new SearchScreen(driver)
                .fillInText("dog")
                .closeBoard()
                .isLiner();
        Assert.assertTrue(isLiner);

        logger.info("Test 'search1' passed successfully");
    }
}
