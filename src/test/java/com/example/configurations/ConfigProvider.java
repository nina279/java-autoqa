package com.example.configurations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.IOException;
import java.util.Properties;

public class ConfigProvider {
    private static final Properties properties = initProperties();

    private static Properties initProperties() {
        Properties property = new Properties();
        try {
            property.load(ClassLoader.getSystemResourceAsStream("config.properties"));
        } catch (IOException e) {
            throw new RuntimeException("File config is not found");
        }
        return property;
    }

    public WebDriver getDriver() {
        // "browser" - імʼя взяте з файлу config.properties
        String driverName  = properties.getProperty("browser");

       WebDriver driver =
               switch (driverName) {
           case "chrome" -> new ChromeDriver();
           case "safari" -> new SafariDriver();
           case "firefox" -> new FirefoxDriver();
           default -> throw new RuntimeException ("Driver is not defined");
        };
        return driver;
    }
}
