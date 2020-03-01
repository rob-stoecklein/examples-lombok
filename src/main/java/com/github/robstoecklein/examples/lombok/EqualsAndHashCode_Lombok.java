package com.github.robstoecklein.examples.lombok;

import lombok.EqualsAndHashCode;

/**
 * https://projectlombok.org/features/EqualsAndHashCode
 */
@SuppressWarnings("FieldMayBeFinal")
public class EqualsAndHashCode_Lombok {

    private transient int transientVar = 10;
    private String name;
    private double score;
    @EqualsAndHashCode.Exclude
    private final Shape shape = new Square(5, 10);
    private String[] tags;
    @EqualsAndHashCode.Exclude
    private int id;

    public String getName() {
        return name;
    }

    @EqualsAndHashCode(callSuper = true)
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
