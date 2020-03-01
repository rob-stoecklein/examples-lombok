package com.github.robstoecklein.examples.rob;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerOldSchool {

    private static final Logger log = LoggerFactory.getLogger(LoggerOldSchool.class);

    private int count;

    public int getCount() {
        return count;
    }

    public void logit(final String text) {
        count++;
        log.info("{}: the count is: {}", text, count);
    }
}
