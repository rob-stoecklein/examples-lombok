package com.github.robstoecklein.examples.fromlomboksite;

/**
 * https://projectlombok.org/features/NonNull
 */
@SuppressWarnings("ALL")
public class NonNull_Vanilla {

    private final String personName;

    public String getPersonName() {
        return personName;
    }

    public NonNull_Vanilla(final String personName) {
        if (personName == null) {
            throw new NullPointerException("personName is marked @NonNull but is null");
        }
        this.personName = personName;
    }
}
