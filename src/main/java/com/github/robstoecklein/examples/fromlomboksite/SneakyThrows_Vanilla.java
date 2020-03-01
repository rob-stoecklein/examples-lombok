package com.github.robstoecklein.examples.fromlomboksite;

import java.io.UnsupportedEncodingException;
import lombok.Lombok;

/**
 * https://projectlombok.org/features/SneakyThrows
 */
@SuppressWarnings("ALL")
public class SneakyThrows_Vanilla implements Runnable {

    public String utf8ToString(byte[] bytes) {
        try {
            return new String(bytes, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw Lombok.sneakyThrow(e);
        }
    }

    public void run() {
        try {
            throw new Throwable();
        } catch (Throwable t) {
            throw Lombok.sneakyThrow(t);
        }
    }
}
