package org.example.generator;

import java.util.stream.Stream;

public interface LineerGenerator {
    public Stream<Long> next(long a, long c, long m);
}