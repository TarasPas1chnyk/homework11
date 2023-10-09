package org.example.arraystoint;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class ArraysOfStringToInt {
    public String sort(String[] str) {
        String result = Arrays.stream(str)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        return result;
    }
}