package com.github.robstoecklein.examples.rob;

import lombok.Value;

@Value  // https://projectlombok.org/features/Value => @Getter @FieldDefaults(makeFinal=true, level=AccessLevel.PRIVATE) @AllArgsConstructor @ToString @EqualsAndHashCode
public class ValueBeanLombok {

    String firstName;
    String lastName;
    int age;
}
