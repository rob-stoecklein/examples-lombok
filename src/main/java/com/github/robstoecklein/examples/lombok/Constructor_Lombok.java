package com.github.robstoecklein.examples.lombok;

import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * https://projectlombok.org/features/constructor
 */
public class Constructor_Lombok<T> {

    private int x, y;
    @NonNull
    private T description;

    @NoArgsConstructor
    public static class NoArgsExample {

        @NonNull
        private String field;
    }
}
