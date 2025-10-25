package Partie1.exo13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("banana", "apple", "cherry");

        List<String> tries = fruits.stream()
                                   .sorted()
                                   .collect(Collectors.toList());

        System.out.println(tries);
    }

}
