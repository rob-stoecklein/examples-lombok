package com.github.robstoecklein.examples.lombok;

import lombok.AccessLevel;
import lombok.ToString;
import lombok.Value;
import lombok.With;
import lombok.experimental.NonFinal;

/**
 * https://projectlombok.org/features/Value
 */
@Value
public class Value_Lombok {

    String name;
    @With(AccessLevel.PACKAGE)
    @NonFinal
    int age;
    double score;
    String[] tags;

    @ToString(includeFieldNames = true)
    @Value(staticConstructor = "of")
    @SuppressWarnings("RedundantModifiersValueLombok")
    public static final class Exercise<T> {

        String name;
        T value;
    }
}
