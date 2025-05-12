package com.uglyeagle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class); // getLogger(..) takes Class<?> type

    public static void main(String[] args) {
        System.out.println("main method started and written to console i.e. stdout");
        logger.info("main method started and written to log file on disk");

        try {
            throw new RuntimeException("fatal error");
        } catch (RuntimeException rex) {
            System.err.println(rex.getMessage() + " written to console i.e stderr");
            logger.error(rex.getMessage() + " written to log file on disk");
        } finally {
            logger.info("execution of the main method has completed.");
        }
        
        logger.warn("do not delete log files unless it is required to do so");

    }
}
