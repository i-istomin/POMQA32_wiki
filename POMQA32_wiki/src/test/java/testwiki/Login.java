package testwiki;

import configwiki.ConfigurationWiki;
import configwiki.DataProviderWiki;
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


    @Test//ne proshel
    public void login1(){
        logger.info("Starting 'login1' test");
        boolean isLogged=new MainScreen(driver)//propisivaem steps to the test
                .clickOnFlowButton()
                .clickOnLoginWikiButton()
              // .fillInLoginForm(Auth.builder().username("Findxpath").password("Irinka123$").build())
                .fillInLoginForm(Auth.builder().username("juliakliot.jk").password("Misha240613").build())
                .clickOnFlowButton()
                .isLogged();

        Assert.assertTrue(isLogged);
        logger.info("Test 'login1' passed successfully");
    }

    @Test(dataProvider = "loginData",dataProviderClass = DataProviderWiki.class)
    public void login2(Auth user){
        logger.info("Starting 'login2' test");
        new MainScreen(driver)
                .clickOnFlowButton()
                .clickOnLoginWikiButton()
                .fillInLoginForm(user)
                .clickOnFlowButton()
                .logOut();

       logger.info("Test 'login2' logged out");
        logger.info("Test 'login2' passed successfully");
    }

    @Test(dataProvider = "logDataCsv",dataProviderClass = DataProviderWiki.class)
    public void login3(Auth user){
        logger.info("Starting 'login3' test");
        new MainScreen(driver)
                .clickOnFlowButton()
                .clickOnLoginWikiButton()
                .fillInLoginForm(user)
                .clickOnFlowButton()
                .logOut();

        logger.info("Test 'login3' logged out");
        logger.info("Test 'login3' passed successfully");
    }

    @Test
    public void loginData4(String login, String pwd) {
        String inf = new MainScreen(driver)
                .clickOnFlowButton()
                .clickOnLoginWikiButton()
                .fillInLoginForm(Auth.builder().username("juliakliot.jk").password("Misha240613").build())
                .clickOnFlowButton()
                .logOut()
                .clickOnFlowButton()
                .getInf();
        Assert.assertEquals(inf, "Log in to Wikipedia");
    }

//    @Test(dataProvider = "loginData",dataProviderClass = DataProviderWiki.class)
//    public void loginData5(String login, String pwd) {
//        String inf = new MainScreen(driver)
//                .clickOnFlowButton()
//                .clickOnLoginWikiButton()
//                .fillInLoginForm(Auth.builder().username("juliakliot.jk").password("Misha240613").build())
//                .clickOnFlowButton()
//                .logOut()
//                .clickOnFlowButton()
//                .getInf();
//        Assert.assertEquals(inf, "Log in to Wikipedia");
//    }

}
