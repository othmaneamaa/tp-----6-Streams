package Partie1.exo11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
       String phrase = "hello world hello streams";

        List<String> uniques = Arrays.stream(phrase.split(" "))
                                     .distinct()
                                     .sorted()
                                     .collect(Collectors.toList());

        System.out.println(uniques);
    }
}
