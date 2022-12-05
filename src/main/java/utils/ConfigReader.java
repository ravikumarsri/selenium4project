package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private Properties pro ;


    String configPropertiesFile = "C:\\Users\\dssri\\IdeaProjects\\selenium4project\\src\\main\\java\\config.properties";

    public ConfigReader()  {


        FileInputStream ip = null;
        try {
            ip = new FileInputStream(configPropertiesFile);
            pro = new Properties();

            try {
                pro.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
                throw new RuntimeException("configuration properties not found at"+ configPropertiesFile);
        }
        } catch (IOException e) {
            e.printStackTrace();
            ;
        }

    }

    public String getUrl() {
        String url = pro.getProperty("url");
        if(url != null)
            return url;
        else throw new RuntimeException("url is not specified in the configuration file");
    }

    public String getBrowser() {
        String browser = pro.getProperty("browser");
        if(browser !=null)
            return browser;
             else throw new RuntimeException("browser is not specified in the configuration file");
        }


    public String getPageLoadTimeout() {
        String pageLoadTimeout = pro.getProperty("pageLoadTimeout");
        if(pageLoadTimeout !=null)
            return pageLoadTimeout;
        else throw new RuntimeException("browser is not specified in the configuration file");
    }

    public String getImplicitlyWait() {
        String implicitlyWait = pro.getProperty("implicitlyWait");
        if(implicitlyWait !=null)
            return implicitlyWait;
        else throw new RuntimeException("browser is not specified in the configuration file");
    }





}





