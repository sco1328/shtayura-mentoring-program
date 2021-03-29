package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
    private static final Logger LOGGER = LogManager.getLogger(PropertyReader.class);

    private PropertyReader() {}

    public static String getValue(String key) {
        Properties prop = new Properties();
        try (InputStream input = new FileInputStream("src/main/resources/dataFile.properties")) {
            prop.load(input);
        } catch (IOException ex) {
            LOGGER.error("Fail to load property file", ex);
        }
        return prop.getProperty(key);
    }
}
