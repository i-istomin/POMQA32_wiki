package testwiki;

import configwiki.ConfigurationWiki;
import model.Auth;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import screens.MainScreen;

import java.lang.reflect.Method;

public class Login extends ConfigurationWiki {

    @BeforeMethod
    public void precondition(Method m) {
        logger.info(("Start test" + m.getName()));
    }


    @Test
    public void login1(){
        logger.info("Starting 'login1' test");
        boolean isLogged=new MainScreen(driver)//propisivaem steps to the test
                .clickOnFlowButton()
                .clickOnLoginWikiButton()
                //.fillInLoginForm(Auth.builder().username("Findxpath").password("_____________").build())
                .fillInLoginForm(Auth.builder().username("juliakliot.jk").password("Misha240613").build())
                .clickOnFlowButton()
                .isLogged();

        Assert.assertTrue(isLogged);
        logger.info("Test 'login1' passed successfully");
    }
}
