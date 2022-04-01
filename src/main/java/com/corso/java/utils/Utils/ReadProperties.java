package com.corso.java.utils.Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/**
 * @author: Christian Chiama (c.chiama@silensec.com)
 * @project-Name: second-week
 * @date: 29-03-2022
 * @time: 15:03 min
 * @file: com.corso.java.db.utils.ReadProperties
 */

public class ReadProperties {

    private static Logger L;
    private Properties properties;
    private InputStream inputStream;
    private String resourceName;
    private final ClassLoader loader = Thread.currentThread().getContextClassLoader();


    public ReadProperties() {
        this.init();
    }

    /**
     * Constructor
     *
     * @param properties
     * @param inputStream
     */
    public ReadProperties(Properties properties, InputStream inputStream) {
        this.properties = properties;
        this.inputStream = inputStream;
    }

    /**
     * @return - L
     */
    public static Logger getL() {
        return L;
    }

    /**
     * initialize variables
     */
    public void init() {
        L = Logger.getInstance();
        this.properties = new Properties();
    }

    /**
     * read a resource name
     *
     * @throws IOException
     */
    public void read(String name) throws IOException {
        this.resourceName = name;
        inputStream = new FileInputStream("src/main/resources/" + this.resourceName);
        this.properties.load(inputStream);
    }

    /**
     * @return - properties
     */
    public Properties getProperties() {
        return properties;
    }

    /**
     * @return - inputStream
     */
    public InputStream getInputStream() {
        return inputStream;
    }

    /**
     * @return - properties
     */
    public String getResourceName() {
        return resourceName;
    }

}