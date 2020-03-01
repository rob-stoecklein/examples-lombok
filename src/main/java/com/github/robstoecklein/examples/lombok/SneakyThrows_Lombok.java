package com.github.robstoecklein.examples.lombok;

import java.io.UnsupportedEncodingException;
import lombok.SneakyThrows;

/**
 * https://projectlombok.org/features/SneakyThrows
 */
public class SneakyThrows_Lombok implements Runnable {

    @SuppressWarnings("CharsetObjectCanBeUsed")
    @SneakyThrows(UnsupportedEncodingException.class)
    public static String utf8ToString(final byte[] bytes) {
        return new String(bytes, "UTF-8");
    }

    @SneakyThrows
    @SuppressWarnings("ProhibitedExceptionThrown")
    public void run() {
        throw new Throwable();
    }
}
