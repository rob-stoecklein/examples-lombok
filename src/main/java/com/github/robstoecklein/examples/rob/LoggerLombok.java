package com.github.robstoecklein.examples.rob;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j  // https://projectlombok.org/features/log
public class LoggerLombok {

    @Getter
    private int count;

    public void logit(final String text) {
        count++;
        log.info("{}: the count is: {}", text, count);
    }
}
