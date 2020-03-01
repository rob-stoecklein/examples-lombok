package com.github.robstoecklein.examples.lombok;

import lombok.ToString;

/**
 * https://projectlombok.org/features/ToString
 */
public class ToString_Lombok {

    private static final int STATIC_VAR = 10;
    private String name;
    private final Shape shape = new Square(5, 10);
    private String[] tags;
    @ToString.Exclude
    private int id;

    public String getName() {
        return name;
    }

    @ToString(callSuper = true, includeFieldNames = true)
    public static class Square extends Shape {

        private final int width, height;

        public Square(final int width, final int height) {
            this.width = width;
            this.height = height;
        }
    }

    @SuppressWarnings("EmptyClass")
    public static class Shape {

    }
}
