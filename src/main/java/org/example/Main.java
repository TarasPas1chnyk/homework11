package org.example;


import org.example.arraystoint.ArraysOfStringToInt;
import org.example.generator.LineerGenerator;
import org.example.generator.LineerGeneratorImpl;
import org.example.list.ListOfNames;
import org.example.listofstrings.ListOfStrings;
import org.example.move.MyOwnMove;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alan");
        names.add("Vasia");
        names.add("Ivan");
        names.add("Oleg");
        names.add("Kolia");
        names.add("Anton");
        ListOfNames name = new ListOfNames();
        System.out.println("name.listOfNames(names) = " + name.listOfNames(names));
        ListOfStrings listOfStrings = new ListOfStrings();
        System.out.println("listOfStrings.listOfStrings(names) = " + listOfStrings.listOfStrings(names));
        ArraysOfStringToInt arraysOfStringToInt = new ArraysOfStringToInt();
        String[] str = {"1, 2, 0", "4, 5"};
        System.out.println("arraysOfStringToInt.sort(str) = " + arraysOfStringToInt.sort(str));
        LineerGenerator lineerGenerator = new LineerGeneratorImpl(25214903917L, 11L, (long) Math.pow(2, 48));
        lineerGenerator.next(25214903917L, 11L, (long) Math.pow(2, 48))
                .limit(10)
                .forEach(System.out::println);

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
        Stream<Integer> integerStream1 = Stream.of(2, 4, 5, 6, 7, 8);
        MyOwnMove.zip(integerStream, integerStream1).forEach(System.out::println);


    }

}