package net.safedata.maven.intro.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigLoading {

    public static void main(String[] args) {
        final Properties webServicesProperties = loadProperties("webservices-endpoints.properties");
        System.out.println("The current dossiers WS URL is " + webServicesProperties.getProperty("used.dossiers.url"));
    }

    private static Properties loadProperties(String fileName) {
        final Properties webServicesProps = new Properties();

        final ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        try (final InputStream in = classLoader.getResourceAsStream(fileName)) {
            webServicesProps.load(in);
        } catch (final IOException ex) {
            ex.printStackTrace();
        }

        return webServicesProps;
    }
}
