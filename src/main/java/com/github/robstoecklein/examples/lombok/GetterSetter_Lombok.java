package com.github.robstoecklein.examples.lombok;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * https://projectlombok.org/features/GetterSetter
 */
public class GetterSetter_Lombok {

    @Getter
    @Setter
    private int age = 10;

    @Setter(AccessLevel.PROTECTED)
    @SuppressWarnings("FieldHasSetterButNoGetter")
    private String name;

    @Override
    public String toString() {
        return String.format("%s (age: %d)", name, age);
    }
}
