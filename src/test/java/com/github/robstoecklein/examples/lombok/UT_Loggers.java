package com.github.robstoecklein.examples.lombok;

import org.junit.jupiter.api.Test;

class UT_Loggers {

    @Test
    void compareLoggers() {

        final LoggerLombok loggerLombok = new LoggerLombok();
        final LoggerOldSchool loggerOldSchool = new LoggerOldSchool();

        loggerLombok.logit("New school");
        loggerOldSchool.logit("Old school");
    }
}
