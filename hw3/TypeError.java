package hw3;

import java.io.UncheckedIOException;

public class TypeError extends RuntimeException {
    public TypeError(String s) {
        super(s);
    }
}
