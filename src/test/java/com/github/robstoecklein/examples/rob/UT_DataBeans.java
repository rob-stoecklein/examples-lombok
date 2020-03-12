package com.github.robstoecklein.examples.rob;

import static org.junit.jupiter.api.Assertions.assertEquals;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class UT_DataBeans {

    @Test
    void compareBeans() {

        final DataBeanLombok dataBeanLombok = new DataBeanLombok(true, 47, "Fred");
        final DataBeanOldSchool dataBeanOldSchool = new DataBeanOldSchool(true, 47, "Fred");

        log.info(dataBeanLombok.toString());
        log.info(dataBeanOldSchool.toString());

        assertEquals(dataBeanLombok.isEnabled(), dataBeanOldSchool.isEnabled());
        assertEquals(dataBeanLombok.getAge(), dataBeanOldSchool.getAge());
        assertEquals(dataBeanLombok.getFirstName(), dataBeanOldSchool.getFirstName());
    }
}
