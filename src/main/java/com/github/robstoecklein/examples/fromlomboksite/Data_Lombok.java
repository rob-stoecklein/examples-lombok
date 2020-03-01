package com.github.robstoecklein.examples.fromlomboksite;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

/**
 * https://projectlombok.org/features/Data
 */
@Data
public class Data_Lombok {

    private final String name;
    @Setter(AccessLevel.PACKAGE)
    private int age;
    private double score;
    private String[] tags;

    @ToString(includeFieldNames = true)
    @Data(staticConstructor = "of")
    public static final class Exercise<T> {

        private final String name;
        private final T value;
    }
}
