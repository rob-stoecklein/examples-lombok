package com.github.robstoecklein.examples.fromlomboksite;

import lombok.extern.apachecommons.CommonsLog;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

/**
 * https://projectlombok.org/features/log
 */
@SuppressWarnings("ALL")
public class Log_Lombok {

    @Log
    public static class LogExampleLog {

        public static void main(String... args) {
            log.severe("Something's wrong here");
        }
    }

    @Slf4j
    public static class LogExampleSlf4j {

        public static void main(final String... args) {
            log.error("Something else is wrong here");
        }
    }

    //@CommonsLog(topic = "CounterLog")
    public static class LogExampleCategory {

        public static void main(final String... args) {
            //FIXME log.error("Calling the 'CounterLog' with a message");
        }
    }
}
