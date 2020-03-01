package com.github.robstoecklein.examples.lombok;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import lombok.Cleanup;

/**
 * https://projectlombok.org/features/Cleanup
 */
public final class Cleanup_Lombok {

    private Cleanup_Lombok() {
    }

    @SuppressWarnings("IOResourceOpenedButNotSafelyClosed")
    public static void main(final String[] args) throws IOException {
        @Cleanup final InputStream in = new FileInputStream(args[0]);
        @Cleanup final OutputStream out = new FileOutputStream(args[1]);
        final byte[] bytes = new byte[10000];
        while (true) {
            final int r = in.read(bytes);
            if (r == -1) {
                break;
            }
            out.write(bytes, 0, r);
        }
    }
}
