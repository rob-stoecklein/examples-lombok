package com.github.robstoecklein.examples.rob;

import lombok.Value;

@Value  // https://projectlombok.org/features/Value => @Getter @FieldDefaults(makeFinal=true, level=AccessLevel.PRIVATE) @AllArgsConstructor @ToString @EqualsAndHashCode
public class ValueBeanLombok {

    private final String firstName;
    private final String lastName;
    private final int age;
}