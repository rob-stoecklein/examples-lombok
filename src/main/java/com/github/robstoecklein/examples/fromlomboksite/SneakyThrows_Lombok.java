package com.github.robstoecklein.examples.fromlomboksite;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import lombok.SneakyThrows;

/**
 * https://projectlombok.org/features/SneakyThrows
 */
public class SneakyThrows_Lombok implements Runnable {

    @SneakyThrows(UnsupportedEncodingException.class)
    public static String utf8ToString(final byte[] bytes) {
        return new String(bytes, StandardCharsets.UTF_8);
    }

    @SneakyThrows
    @SuppressWarnings("ProhibitedExceptionThrown")
    public void run() {
        throw new Throwable();
    }
}
