package com.corso.java.utils.Utils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class LOG {

    public static final Logger L = Logger.getLogger(LOG.class);
    public static LOG instance = null;
    { BasicConfigurator.configure(); }

    private LOG() {}

    public static LOG getInstance() {
        if (instance == null) {
            synchronized (LOG.class) {
                instance = new LOG();
            }
            return instance;
        }
        return instance;
    }
    public void info(String parameter) {
        L.info(parameter);
    }
    public void debug(String parameter) {
        L.debug(parameter);
    }
    private void warn(String parameter) {
        L.warn(parameter);
    }
    private void error(String parameter) {
        L.error(parameter);
    }
}


