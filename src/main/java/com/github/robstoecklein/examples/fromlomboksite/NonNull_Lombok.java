package com.github.robstoecklein.examples.fromlomboksite;

import lombok.Getter;
import lombok.NonNull;

/**
 * https://projectlombok.org/features/NonNull
 */
public class NonNull_Lombok {

    @Getter
    private final String personName;

    public NonNull_Lombok(@NonNull final String personName) {
        this.personName = personName;
    }
}
