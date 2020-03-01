package com.github.robstoecklein.examples.fromlomboksite;

import lombok.Getter;

/**
 * https://projectlombok.org/features/GetterLazy
 */
public class GetterLazy_Lombok {

    @Getter(lazy = true)
    private final double[] cached = expensive();

    private static double[] expensive() {
        final double[] result = new double[1000000];
        for (int i = 0; i < result.length; i++) {
            result[i] = StrictMath.asin(i);
        }
        return result;
    }
}
