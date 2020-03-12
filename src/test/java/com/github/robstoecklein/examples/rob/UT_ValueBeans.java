package com.github.robstoecklein.examples.rob;

import static org.junit.jupiter.api.Assertions.assertEquals;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class UT_ValueBeans {

    @Test
    void compareBeans() {

        final ValueBeanLombok valueBeanLombok = new ValueBeanLombok("Fred", "Flintstone", 35);
        final ValueBeanOldSchool valueBeanOldSchool = new ValueBeanOldSchool("Fred", "Flintstone", 35);

        log.info(valueBeanLombok.toString());
        log.info(valueBeanOldSchool.toString());

        assertEquals(valueBeanLombok.getFirstName(), valueBeanOldSchool.getFirstName());
        assertEquals(valueBeanLombok.getLastName(), valueBeanOldSchool.getLastName());
        assertEquals(valueBeanLombok.getAge(), valueBeanOldSchool.getAge());
    }
}
