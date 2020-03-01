package com.github.robstoecklein.examples.rob;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UT_DataBeans {

    @Test
    void compareBeans() {

        final DataBeanLombok dataBeanLombok = new DataBeanLombok(true, 47, "Fred");
        final DataBeanOldSchool dataBeanOldSchool = new DataBeanOldSchool(true, 47, "Fred");

        System.out.println(dataBeanLombok);
        System.out.println(dataBeanOldSchool);

        assertEquals(dataBeanLombok.isEnabled(), dataBeanOldSchool.isEnabled());
        assertEquals(dataBeanLombok.getAge(), dataBeanOldSchool.getAge());
        assertEquals(dataBeanLombok.getFirstName(), dataBeanOldSchool.getFirstName());
    }
}
