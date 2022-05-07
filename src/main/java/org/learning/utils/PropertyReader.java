package org.learning.utils;

import java.io.FileReader;
import java.util.Properties;

public class PropertyReader { // Read properties from resource

    Properties properties;

    public PropertyReader() {

    }

    public void loadProperties(String filename) {
        properties = new Properties();

        try {
            properties.load(new FileReader(filename));
        } catch (Exception e) {
            throw new RuntimeException("Failed to load properties file");
        }
    }
}
