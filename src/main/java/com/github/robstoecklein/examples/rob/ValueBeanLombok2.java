package com.github.robstoecklein.examples.rob;

import lombok.Value;

@Value(staticConstructor = "of")
public class ValueBeanLombok2 {

    String name;
    int age;
    double rating;
}
