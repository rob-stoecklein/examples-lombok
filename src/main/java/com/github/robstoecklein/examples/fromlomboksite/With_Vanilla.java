package com.github.robstoecklein.examples.fromlomboksite;

import lombok.NonNull;

/**
 * https://projectlombok.org/features/With
 */
@SuppressWarnings("ALL")
public class With_Vanilla {

    private @NonNull
    final String name;
    private final int age;

    public With_Vanilla(String name, int age) {
        if (name == null) {
            throw new NullPointerException();
        }
        this.name = name;
        this.age = age;
    }

    protected With_Vanilla withName(@NonNull String name) {
        if (name == null) {
            throw new java.lang.NullPointerException("name");
        }
        return this.name == name ? this : new With_Vanilla(name, age);
    }

    public With_Vanilla withAge(int age) {
        return this.age == age ? this : new With_Vanilla(name, age);
    }
}
