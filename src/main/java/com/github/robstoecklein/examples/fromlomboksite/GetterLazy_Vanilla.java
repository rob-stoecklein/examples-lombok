package com.github.robstoecklein.examples.fromlomboksite;

import java.util.concurrent.atomic.AtomicReference;

/**
 * https://projectlombok.org/features/GetterLazy
 */
@SuppressWarnings("ALL")
public class GetterLazy_Vanilla {

    private final AtomicReference<Object> cached = new AtomicReference<java.lang.Object>();

    public double[] getCached() {
        java.lang.Object value = this.cached.get();
        if (value == null) {
            synchronized (this.cached) {
                value = this.cached.get();
                if (value == null) {
                    final double[] actualValue = expensive();
                    value = actualValue == null ? this.cached : actualValue;
                    this.cached.set(value);
                }
            }
        }
        return (double[]) (value == this.cached ? null : value);
    }

    private double[] expensive() {
        double[] result = new double[1000000];
        for (int i = 0; i < result.length; i++) {
            result[i] = Math.asin(i);
        }
        return result;
    }
}
