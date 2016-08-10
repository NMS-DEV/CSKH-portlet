package com.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.liferay.portal.kernel.util.Validator;

public class FileUtils {
    private static final Properties prop = new Properties();
    private static final String pathFile = System.getenv("PBX_HOME_APP") + "/config.properties";
    InputStream input = null;

    public FileUtils() {
        try {
            input = new FileInputStream(pathFile);
            prop.load(input);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    
    public static String getValue(String key, String valueDefault) {
        new FileUtils();
        String result = prop.getProperty(key);
        if (Validator.isNull(result)) {
            return valueDefault;
        }
        return result;
    }
}
