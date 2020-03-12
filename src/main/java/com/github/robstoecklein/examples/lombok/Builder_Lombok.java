package com.github.robstoecklein.examples.lombok;

import java.util.Set;
import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

/**
 * https://projectlombok.org/features/Builder
 */
@Builder
@ToString
public class Builder_Lombok {

    @Builder.Default
    private final long created = System.currentTimeMillis();
    private final String name;
    private final int age;
    @Singular
    private final Set<String> occupations;
}
