package org.example.move;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyOwnMove<T> {
    Stream<T> first;
    Stream<T> second;

    public MyOwnMove(Stream<T> first, Stream<T> second) {
        this.first = first;
        this.second = second;
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> movesElemnts = new ArrayList<>();
        Iterator<T> iterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();
        while (iterator.hasNext() && secondIterator.hasNext()) {
            movesElemnts.add(iterator.next());
            movesElemnts.add(secondIterator.next());
        }


        return movesElemnts.stream();
    }

}