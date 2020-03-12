package com.github.robstoecklein.examples.lombok;

import com.github.robstoecklein.examples.lombok.Value_Lombok.Exercise;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class UT_Value_Lombok {

    @Test
    void testIt() {

        final Value_Lombok value = new Value_Lombok("Jack", 1, 99, null);
        log.info(value.toString());

        final Exercise<Integer> exercise = Value_Lombok.Exercise.of("Jumping Jacks", 25);
        log.info(exercise.toString());
    }
}
