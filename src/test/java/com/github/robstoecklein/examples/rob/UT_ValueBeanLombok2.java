package com.github.robstoecklein.examples.rob;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class UT_ValueBeanLombok2 {

    @Test
    void test() {

        final ValueBeanLombok2 value = ValueBeanLombok2.of("Jack", 1, 99.9);
        log.info(value.toString());
    }
}
