package com.github.robstoecklein.examples.lombok;

import lombok.AccessLevel;
import lombok.NonNull;
import lombok.With;

/**
 * https://projectlombok.org/features/With
 */
public class With_Lombok {

    @With(AccessLevel.PROTECTED)
    @NonNull
    private final String name;
    @With
    private final int age;

    @SuppressWarnings("ProhibitedExceptionThrown")
    public With_Lombok(final String name, final int age) {
        if (name == null) {
            throw new NullPointerException();
        }
        this.name = name;
        this.age = age;
    }
}
