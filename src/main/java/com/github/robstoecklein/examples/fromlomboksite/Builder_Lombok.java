package com.github.robstoecklein.examples.fromlomboksite;

import java.util.Set;
import lombok.Builder;
import lombok.Singular;

/**
 * // https://projectlombok.org/features/Builder
 */
@Builder
public class Builder_Lombok {

    @Builder.Default
    private final long created = System.currentTimeMillis();
    private final String name;
    private final int age;
    @Singular
    private final Set<String> occupations;
}
