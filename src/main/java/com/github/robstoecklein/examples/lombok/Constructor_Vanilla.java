package com.github.robstoecklein.examples.lombok;

import lombok.NonNull;

/**
 * https://projectlombok.org/features/constructor
 */
@SuppressWarnings("ALL")
public class Constructor_Vanilla<T> {

    private int x, y;
    @NonNull
    private T description;

    private Constructor_Vanilla(T description) {
        if (description == null) {
            throw new NullPointerException("description");
        }
        this.description = description;
    }

    public static <T> Constructor_Vanilla<T> of(T description) {
        return new Constructor_Vanilla<T>(description);
    }

    @java.beans.ConstructorProperties({"x", "y", "description"})
    protected Constructor_Vanilla(int x, int y, T description) {
        if (description == null) {
            throw new NullPointerException("description");
        }
        this.x = x;
        this.y = y;
        this.description = description;
    }

    public static class NoArgsExample {

        @NonNull
        private String field;

        public NoArgsExample() {
        }
    }
}
