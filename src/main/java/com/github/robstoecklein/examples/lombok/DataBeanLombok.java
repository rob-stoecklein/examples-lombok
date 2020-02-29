package com.github.robstoecklein.examples.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // => @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class DataBeanLombok {

    private boolean isEnabled;
    private Integer age;
    private String firstName;
}
