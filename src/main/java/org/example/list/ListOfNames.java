package org.example.list;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListOfNames {
    public List<String> listOfNames(List<String> list) {
        List<String> collect = IntStream.range(0, list.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> i + ". " + list.get(i))
                .collect(Collectors.toList());
        return collect;


    }
}