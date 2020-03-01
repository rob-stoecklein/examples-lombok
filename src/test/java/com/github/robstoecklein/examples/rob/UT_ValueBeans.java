package com.github.robstoecklein.examples.rob;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UT_ValueBeans {

    @Test
    void compareBeans() {

        final ValueBeanLombok valueBeanLombok = new ValueBeanLombok("Fred", "Flintstone", 35);
        final ValueBeanOldSchool valueBeanOldSchool = new ValueBeanOldSchool("Fred", "Flintstone", 35);

        System.out.println(valueBeanLombok);
        System.out.println(valueBeanOldSchool);

        assertEquals(valueBeanLombok.getFirstName(), valueBeanOldSchool.getFirstName());
        assertEquals(valueBeanLombok.getLastName(), valueBeanOldSchool.getLastName());
        assertEquals(valueBeanLombok.getAge(), valueBeanOldSchool.getAge());
    }
}
