package org.example.generator;

import java.util.stream.Stream;

public class LineerGeneratorImpl implements LineerGenerator {
    private long a, c, m, seed;

    public LineerGeneratorImpl(long a, long c, long m) {
        this.a = a;
        this.c = c;
        this.m = m;
        seed = 12345L;
    }

    @Override
    public Stream<Long> next(long a, long c, long m) {
        return Stream.iterate(seed, n -> ((a * n + c) % m));
    }
}