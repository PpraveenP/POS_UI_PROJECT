package org.example.POS_UI_Test.TestUtilitiese;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfiger {
   public static Properties pos ;

 public ReadConfiger() {
    try {

        File file = new File("./Configretion/configer.properties");
        FileInputStream fi = new FileInputStream(file);
        pos = new Properties();
        pos.load(fi);
    }
    catch (FileNotFoundException e){
    throw new RuntimeException(e);

    }
    catch (IOException e){
        throw new RuntimeException();
    }

}
    public String getURL()
    {
        String url=pos.getProperty("BaseURL");
        return url;
    }
    public String getChrome()
    {
       String chrome= pos.getProperty("Chrome");
        return chrome;
    }
    public String getFirefox()
    {
        String firefox=pos.getProperty("Firefox");
        return firefox;
    }
    public String getIEexplore()
    {
        String ieexplore=pos.getProperty("IEexplore");
        return ieexplore;
    }
    public String getPassword()
    {
        String password=pos.getProperty("Password");
        return password;
    }
    public String getUsername()
    {
        String username=pos.getProperty("Username");
        return username;
    }
    public String getTechPassword()
    {
        String password=pos.getProperty("Tech0-Password");
        return password;
    }
    public String getTechUsername()
    {
        String username=pos.getProperty("Tech-Username");
        return username;
    }
}
