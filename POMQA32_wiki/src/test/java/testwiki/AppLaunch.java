package testwiki;

import configwiki.ConfigurationWiki;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.MainScreen;

public class AppLaunch extends ConfigurationWiki {

    @Test
    public void launchWiki(){
        String detail=new MainScreen(driver).getDetail();
        Assert.assertEquals(detail,"In the news");


    }
}
