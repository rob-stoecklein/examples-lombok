package com.github.robstoecklein.examples.rob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // https://projectlombok.org/features/Data => @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class DataBeanLombok {

    private boolean isEnabled;
    private Integer age;
    private String firstName;
}
