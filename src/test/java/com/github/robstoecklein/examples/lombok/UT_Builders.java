package com.github.robstoecklein.examples.lombok;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class UT_Builders {

    @Test
    void builders() {

        final Builder_Lombok builder = Builder_Lombok
                .builder()
                .name("Fred Flintstone")
                .age(53)
                .occupation("Father")
                .occupation("Truck Driver")
                .build();
        log.info(builder.toString());

        // Builder_Vanilla too complicated -- code not finished
    }
}
