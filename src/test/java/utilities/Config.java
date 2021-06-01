package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Config {
 private static  Properties properties;
    static {

        File file = new File("src/test/java/utilities/config.properties");
        try {
            FileInputStream input = new FileInputStream(file);
            properties = new Properties();
            properties.load(input);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     public static String getProperty(String key){
        return properties.getProperty(key);
     }
}