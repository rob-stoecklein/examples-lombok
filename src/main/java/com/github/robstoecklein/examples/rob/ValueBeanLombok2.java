package com.github.robstoecklein.examples.rob;

import lombok.Value;

@Value(staticConstructor = "of")
public class ValueBeanLombok2 {

    private String name;
    private int age;
    private double rating;
}
