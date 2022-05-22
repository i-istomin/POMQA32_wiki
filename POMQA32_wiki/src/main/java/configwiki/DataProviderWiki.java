package configwiki;

import model.Auth;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviderWiki {

    @DataProvider
    public static Iterator<Object[]>loginData(){
        List<Object[]> list=new ArrayList<>();
        list.add(((new Object[]{Auth.builder().username("juliakliot.jk").password("Misha240613").build()})));
        list.add(((new Object[]{Auth.builder().username("julia357").password("Misha*$240613").build()})));
      //  list.add(new Object[]{Auth.builder().username().password().build()});
        return list.iterator();

    }

    @DataProvider
    public  static Iterator<Object[]>logDataCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("POMQA32_wiki/src/test/resources/logData.csv")));
        String line = reader.readLine();
        while (line!=null){
            String[] split = line.split(",");
            list.add(new Object[]{Auth.builder().username(split[0]).password(split[1]).build()});
            line = reader.readLine();
        }
        return  list.iterator();
    }
}
