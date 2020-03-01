package com.github.robstoecklein.examples.lombok;

import lombok.Synchronized;

/**
 * https://projectlombok.org/features/Synchronized
 */
@SuppressWarnings("ALL")
public class Synchronized_Lombok {

    private final Object readLock = new Object();

    @Synchronized
    public static void hello() {
        System.out.println("world");
    }

    @Synchronized
    public int answerToLife() {
        return 42;
    }

    @Synchronized("readLock")
    public void foo() {
        System.out.println("bar");
    }
}
