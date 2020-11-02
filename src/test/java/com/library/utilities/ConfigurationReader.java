package com.library.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();    // Properties Object

    static {
        try {
            InputStream file = new FileInputStream("configuration.properties"); // Polymorphic Object
            properties.load(file);
            file.close();

        } catch (IOException e) {
            System.out.println("Properties file not found.");
        }
    }
    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }

}
