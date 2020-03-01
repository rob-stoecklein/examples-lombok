package com.github.robstoecklein.examples.fromlomboksite;

import java.util.logging.Logger;

/**
 * https://projectlombok.org/features/log
 */
@SuppressWarnings("ALL")
public class Log_Vanilla {

    public static class LogExample {

        private static final Logger log = Logger.getLogger(LogExample.class.getName());

        public static void main(String... args) {
            log.severe("Something's wrong here");
        }
    }

    public static class LogExampleSlf {

        private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(LogExampleSlf.class);

        public static void main(String... args) {
            log.error("Something else is wrong here");
        }
    }

    public static class LogExampleCategory {

        //private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog("CounterLog");

        public static void main(String... args) {
            //log.error("Calling the 'CounterLog' with a message");
        }
    }
}
