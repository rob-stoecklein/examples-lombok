package com.github.robstoecklein.examples.rob;

import org.junit.jupiter.api.Test;

class UT_Loggers {

    @Test
    void compareLoggers() {

        final LoggerLombok loggerLombok = new LoggerLombok();
        final LoggerOldSchool loggerOldSchool = new LoggerOldSchool();

        loggerLombok.myMethod("New school");
        loggerOldSchool.myMethod("Old school");
    }
}
