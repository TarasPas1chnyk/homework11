package org.example.listofstrings;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStrings {
    public List<String> listOfStrings(List<String> list) {
        List<String> collect = list.stream()
                .sorted(Comparator.reverseOrder())
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        return collect;
    }
}